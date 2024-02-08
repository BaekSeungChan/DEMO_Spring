package com.qortmdcks.demo.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Entity
//@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID postId;
    private String title;
    private String contents;
    private String author;
    private LocalDateTime createdDateTime;
}
