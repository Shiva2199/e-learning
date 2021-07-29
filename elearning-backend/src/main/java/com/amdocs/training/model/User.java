package com.amdocs.training.model;

public class User {

	private int user_id;
	private String name;
	private long phone_no;
	private String email;
	private String address;
	private String reg_date;
	private String password;
	private long upload_photo;
	public User() {
		
	}

	public User(int id, String name, long phone_no, String email, String address, String reg_date, String password,
			long upload_photo) {
		this.user_id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.reg_date = reg_date;
		this.password = password;
		this.upload_photo = upload_photo;
		this.phone_no = phone_no;
	}

	public void setPhone(long phone_no) {
		this.phone_no = phone_no;
	}

	public void setId(int user_id) {
		this.user_id = user_id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setupload_photo(long upload_photo) {
		this.upload_photo = upload_photo;
	}

	public int getId() {
		return this.user_id;
	}

	public long getPhone() {
		return this.phone_no;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public String getAddress() {
		return this.address;
	}

	public String getReg_date() {
		return this.reg_date;
	}

	public String getPassword() {
		return this.password;
	}

	public long getUpload_photo() {
		return this.upload_photo;
	}

	public String toString() {
		return ("ID : " + this.user_id + " Name : " + this.name + " Phone : " + this.phone_no + " Email : " + this.email
				+ " Address : " + this.address + " Reg_date : " + this.reg_date + " Password : " + this.password
				+ " Photo : " + this.upload_photo);
	}

}
