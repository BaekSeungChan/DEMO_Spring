package com.qortmdcks.demo.repository;

import com.qortmdcks.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    public Optional<User> findByEmail(String email);
}
