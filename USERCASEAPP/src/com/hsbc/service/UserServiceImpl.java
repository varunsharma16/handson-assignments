package com.hsbc.service;

import java.util.ArrayList;

import org.hsbc.exception.AuthenticationException;
import org.hsbc.exception.UserNotFoundException;

import com.hsbc.dao.UserDao;
import com.hsbc.model.User;
import com.hsbc.utility.UserFactory;

public class UserServiceImpl implements UserService {
	private UserDao userDao = null;

	public UserServiceImpl() {
		userDao = (UserDao) UserFactory.getInstance("dao");
	}

	@Override
	public User login(String username, String password)  throws AuthenticationException{
		
		User user = userDao.authenticate(username, password);
		if(user == null) {
			throw new AuthenticationException("Sorry something went wrong");
		}
		return user;
		
	}

	@Override
	public void createUser(User user) {
		userDao.store(user);	
		
	}

	@Override
	public ArrayList<User> fetchAllUsers() {
		return userDao.fetchAllUsers();
	
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
		
		
	}

	@Override
	public User getUser(int userId) throws UserNotFoundException {
		// TODO Auto-generated method stub
		User user = userDao.getUser(userId);
		if(user == null) {
			throw new UserNotFoundException("no user found");
		}
		return user;
	}

	@Override
	public void removeUser(String name) {
		userDao.deleteUser(name);
		
	}
	public void nameupdate(User user) {
		userDao.updateUserByName(user);
	}

}
