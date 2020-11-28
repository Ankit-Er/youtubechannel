package com.progrank.security.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.progrank.security.model.User;

public interface UserDetailsRepo extends JpaRepository<User, Integer> {

	Optional<User> findByUsername(String uname);
}
