package com.niit.secondprojectbackend.dao;

import java.util.List;

import com.niit.secondprojectbackend.model.User;

public interface UserDAO {

	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
	public User getUserByUsername(String username);
	public List<User> listUsers();
	public User getUserByUserId(long userId);
	public User getUserByUsername1(String username);
	public boolean isExistingUser(User user);
	public boolean authenticate(String username, String password);
	
	
}
