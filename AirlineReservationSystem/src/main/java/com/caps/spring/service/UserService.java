package com.caps.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caps.spring.beans.UserDTO;
import com.caps.spring.dao.UserDAO;

@Service
public class UserService {
	
	@Autowired
	private UserDAO userdao;
	
	public UserDTO login(UserDTO userdto) {
		return userdao.login(userdto);
		
	}
	public boolean createUser(UserDTO userdto) {
		return userdao.createUser(userdto);
		
	}
	public boolean deleteUser(String email) {
		return userdao.deleteUser(email);
		
	}
	public boolean updateUser(UserDTO userdto) {
		return userdao.updateUser(userdto);
		
	}

}
