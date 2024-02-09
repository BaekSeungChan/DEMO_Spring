package com.qortmdcks.demo.controller;

import com.qortmdcks.demo.model.Post;
import com.qortmdcks.demo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

//    @Autowired
//    public PostController(PostService postService){
//        this.postService = postService;
//    }

//    @GetMapping("/list")
//    public List<Post> postList(@RequestParam String title){
//        return postService.postList(title);
//    }

    @GetMapping("/list")
    public List<Post> postList(){
        return postService.postList();
    }

//    @GetMapping("/{postId}")
//    public Post postDetail(@PathVariable String postId){
//        return new Post(UUID.randomUUID(), "title1", "contents1",postId, LocalDateTime.now());
//    }

}
