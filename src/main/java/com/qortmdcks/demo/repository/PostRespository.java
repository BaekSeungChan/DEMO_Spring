package com.qortmdcks.demo.repository;

import com.qortmdcks.demo.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PostRespository extends JpaRepository<Post, UUID> {

    List<Post> findByTitle(String title);
    List<Post> findByTitleContains(String title);
    // query creation

}
