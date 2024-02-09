package com.qortmdcks.demo;

import com.qortmdcks.demo.model.Post;
import com.qortmdcks.demo.model.User;
import com.qortmdcks.demo.repository.PostRespository;
import com.qortmdcks.demo.repository.UserRepository;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    private final PostRespository postRespository;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        List<Post> postList = List.of(
                new Post(UUID.randomUUID(), "title1", "contents1","", LocalDateTime.now()),
                new Post(UUID.randomUUID(), "title2≤", "contents2","", LocalDateTime.now()),
                new Post(UUID.randomUUID(), "title3", "contents3","", LocalDateTime.now())
        );

//        postRespository.saveAll(postList);

        for(Post p : postList){
            postRespository.save(p);
        }

        List<User> userList = List.of(
                User.builder()
                        .email("chan@naver.com")
                        .password(passwordEncoder.encode("1234"))
                        .name("chan")
                        .build(),

                User.builder()
                        .email("chan11@naver.com")
                        .password(passwordEncoder.encode("12345"))
                        .name("chain")
                        .build()
        );

        userRepository.saveAll(userList);
    }
}
