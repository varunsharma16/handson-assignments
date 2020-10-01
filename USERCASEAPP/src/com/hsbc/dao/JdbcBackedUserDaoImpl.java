package com.hsbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import org.hsbc.exception.AuthenticationException;
import org.hsbc.exception.UserNotFoundException;

import com.hsbc.model.User;
import com.hsbc.utility.DBUtility;

public class JdbcBackedUserDaoImpl  implements UserDao{

	@Override
	public User authenticate(String username, String password) throws AuthenticationException {
		// TODO Auto-generated method stub
		User user = null;
		
		try {
			
			Connection connection = DBUtility.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from user_details where name = ? and password = ?");
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);

			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				user = new User();
				user.setUserId(resultSet.getInt("user_id"));
				user.setUsername(resultSet.getString("name"));
				user.setPassword(resultSet.getString("password"));
				user.setPhone(resultSet.getLong("phone"));
				user.setDob(resultSet.getString("name"));
				return user;
			}
			resultSet.close();
			preparedStatement.close();
			connection.close();
			if(user == null) {
				throw new AuthenticationException(" Username or Password is Incorrect");
			} 
		} catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public void store(User user) {
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("insert into user_details values(?,?,?,?,?)");
			preparedStatement.setInt(1, user.getUserId());
			preparedStatement.setString(2, user.getUsername());
			preparedStatement.setString(3, user.getPassword());
			preparedStatement.setLong(4, user.getPhone());
            preparedStatement.setString(5,user.getDob());
			preparedStatement.executeUpdate();

			preparedStatement.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<User> fetchAllUsers() {
		// TODO Auto-generated method stub
		 ArrayList<User> userList = new ArrayList<User>();
		 User user = null;
		try {

			Connection connection = DBUtility.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from user_details");

			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				user = new User();
				user.setUserId(resultSet.getInt("user_id"));
				user.setUsername(resultSet.getString("name"));
				user.setPassword(resultSet.getString("password"));
				user.setPhone(resultSet.getLong("phone"));
				user.setDob(resultSet.getString("dob"));
				userList.add(user);
			}

			resultSet.close();
			preparedStatement.close();
			connection.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return userList;
	}

	

	@Override
	public void updateUser(User user) {
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement updateStatement = connection.prepareStatement("update user_details set phone=?,password=? where user_id=?");
			updateStatement.setInt(3, user.getUserId());
			updateStatement.setString(2, user.getPassword());
			updateStatement.setLong(1, user.getPhone());
			

			updateStatement.executeUpdate();

			updateStatement.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateUserByName(User user) {
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement updateStatement = connection.prepareStatement("update user_details set username=?,password=? where user_id=?");
			updateStatement.setInt(3, user.getUserId());
			updateStatement.setString(2, user.getPassword());
			updateStatement.setString(1, user.getUsername());
			

			updateStatement.executeUpdate();

			updateStatement.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		
		
		
	}


		
	

	@Override
	public User getUser(int userId) throws UserNotFoundException {
		// TODO Auto-generated method stub
		User user = null;
		try {

			Connection connection = DBUtility.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from user_details where user_id = ?");
			preparedStatement.setInt(1, userId);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()){
				user = new User();
				user.setUserId(resultSet.getInt("user_id"));
				user.setUsername(resultSet.getString("name"));
				user.setPassword(resultSet.getString("password"));
				user.setPhone(resultSet.getLong("phone"));
				user.setDob(resultSet.getNString("dob"));
				return user;
			}

			resultSet.close();
			preparedStatement.close();
			connection.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	@Override
	public void deleteUser(String name)
	{
		try {

			Connection connection = DBUtility.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("delete from user_details where name=?");
			preparedStatement.setString(1,name);
		    preparedStatement.executeUpdate();
		    preparedStatement.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
