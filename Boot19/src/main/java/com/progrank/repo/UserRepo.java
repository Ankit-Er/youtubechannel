package com.progrank.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.progrank.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	public Optional<User> findByUsername(String uname);
}
