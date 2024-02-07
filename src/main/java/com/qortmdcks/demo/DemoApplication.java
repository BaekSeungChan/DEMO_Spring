package com.qortmdcks.demo;

import com.qortmdcks.demo.model.Post;
import com.qortmdcks.demo.repository.PostRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication implements CommandLineRunner {

    private final PostRespository postRespository;


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Post> postList = List.of(
                new Post(UUID.randomUUID(), "title1", "contents1","", LocalDateTime.now()),
                new Post(UUID.randomUUID(), "title2", "contents2","", LocalDateTime.now()),
                new Post(UUID.randomUUID(), "title3", "contents3","", LocalDateTime.now())
        );

        postRespository.saveAll(postList);
    }
}
