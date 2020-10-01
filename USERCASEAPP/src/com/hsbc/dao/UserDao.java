package com.hsbc.dao;

import java.util.ArrayList;
import java.util.List;

import org.hsbc.exception.AuthenticationException;
import org.hsbc.exception.UserNotFoundException;

import com.hsbc.model.User;

public interface UserDao {
	public User authenticate(String username, String password) throws AuthenticationException;
	public void store(User user);
	public  ArrayList<User> fetchAllUsers();
	public void updateUser(User user);
	public User getUser(int userId) throws UserNotFoundException;
	public void deleteUser(String name);
	public void updateUserByName(User user);
	

}
