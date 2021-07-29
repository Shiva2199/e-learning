package com.amdocs.training.authentication;

public class Login {

	private int loginId;
	private String email;
	private String password;

	public Login() {

	}

	public String getEmail() {
		return email;
	}

	public int getLoginId() {
		return loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String toString() {
		return this.loginId+" "+this.email+" "+this.loginId;
	}

}
