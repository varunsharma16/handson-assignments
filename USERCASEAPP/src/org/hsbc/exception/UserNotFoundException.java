package org.hsbc.exception;

public class UserNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String error;

	public UserNotFoundException(String error) {
		super();
		this.error = error;
	}
	public String getmessage()
	{
		return error;
	}

}
