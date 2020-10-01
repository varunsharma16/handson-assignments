package org.hsbc.exception;

public class AuthenticationException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String error;

	public AuthenticationException(String error) {
		super();
		this.error = error;
	}
	public String getmessage()
	{
		return error;
	}

}
