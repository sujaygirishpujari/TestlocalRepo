package com.sujay.in28minutes.jee;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("Sujay") && password.equals("password");
	}

}