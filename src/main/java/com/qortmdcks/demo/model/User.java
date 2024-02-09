package com.qortmdcks.demo.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID postId;

    private String name;

    @Column(unique = true)
    private String email; // username

    private String password;



}
