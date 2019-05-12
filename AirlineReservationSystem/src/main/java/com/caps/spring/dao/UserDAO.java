package com.caps.spring.dao;

import java.util.List;

import com.caps.spring.beans.UserDTO;

public interface UserDAO {

	
	public UserDTO login(UserDTO userdto);
	public boolean createUser(UserDTO userdto);
	public boolean deleteUser(String email);
	public boolean updateUser(UserDTO userdto);
	List <UserDTO> listOfUsers();

}
