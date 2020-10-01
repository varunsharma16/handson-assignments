package com.hsbc.service;

import java.util.ArrayList;

import org.hsbc.exception.AuthenticationException;
import org.hsbc.exception.UserNotFoundException;

import com.hsbc.model.User;

public interface UserService {
	public User login(String username, String password) throws AuthenticationException;
	public void createUser(User user);
	public ArrayList<User> fetchAllUsers();
	public void updateUser(User user);
	public User getUser(int userId) throws UserNotFoundException;
	public void removeUser(String name);
	public void nameupdate(User user);

}
