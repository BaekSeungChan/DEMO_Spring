package com.qortmdcks.demo.service;

import com.qortmdcks.demo.mapper.PostMapper;
import com.qortmdcks.demo.model.Post;
import com.qortmdcks.demo.repository.PostRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service  // Spirngpoot가 로드 될떄 Bean으로 등록
@RequiredArgsConstructor
public class PostService {

    private final PostRespository postRespository;

    private final PostMapper postMapper;

    public List<Post> postList(String title) {
//        return postRespository.findAll(); // JPA 방식
//        return postMapper.listPost(); // Mybatis

//        return postRespository.findByTitle(title);
        return postRespository.findByTitleContains(title);
    }
}
