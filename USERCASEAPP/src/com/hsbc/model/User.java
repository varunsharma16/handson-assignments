package com.hsbc.model;

public class User {
	private int userId;
	private String username;
	private String password;
	private long phone;
	private String dob;
	
	public User() {
		super();
	}
	public User(int userId, String username, String password, long phone, String dob) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.dob = dob;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", phone=" + phone
				+ ", dob=" + dob + "]";
	}
	
	

}
