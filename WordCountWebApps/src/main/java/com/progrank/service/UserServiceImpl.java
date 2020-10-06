package com.progrank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.progrank.dao.UserDAO;
import com.progrank.model.UserRegDTO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO repo;
	
	@Override
	public boolean registerUser(UserRegDTO user) {
		return repo.registerUser(user) > 0 ? true : false;
	}

}
