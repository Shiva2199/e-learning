package com.amdocs.training.model;

public class Admin {
	private int adminId;
	private String name;
	private String email;
	private String password;
	public Admin() {
		
	}

	public Admin(int adminId, String name, String email, String password) {
		this.adminId = adminId;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAdminId() {
		return this.adminId;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public String getPassword() {
		return this.password;
	}

	public String toString() {
		return ("Admin Id :" + this.adminId + " Name :" + this.name + " Email: " + this.email + " Password: "
				+ this.password);
	}

}
