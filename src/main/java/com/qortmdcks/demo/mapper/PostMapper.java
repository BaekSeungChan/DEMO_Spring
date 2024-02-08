package com.qortmdcks.demo.mapper;

import com.qortmdcks.demo.model.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    public List<Post> listPost();
}
