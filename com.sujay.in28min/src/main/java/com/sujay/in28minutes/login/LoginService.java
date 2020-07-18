package com.sujay.in28minutes.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("sujay") && password.equals("password");
	}
}
