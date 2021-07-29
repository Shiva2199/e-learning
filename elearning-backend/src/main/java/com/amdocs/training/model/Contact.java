package com.amdocs.training.model;

public class Contact {
	private int userId;
	private String name;
	private String email;
	private long phoneNo;
	private String messege;
	private int contactId;
	
	public Contact() {
		
	}
	public Contact(int userid, String name, String email, long phoneNo, String messege, int contactid) {
		this.userId = userid;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.messege = messege;
		this.contactId = contactid;
	}

	public void setUserId(int userid) {
		this.userId = userid;
	}

	public void setName(String name) {
		this.name = name;

	}

	public void setEmail(String email) {
		this.email = email;

	}

	public void setPhoneNo(long phone_no) {
		this.phoneNo = phone_no;

	}

	public void setMessege(String messege) {
		this.messege = messege;

	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public int getUserId() {
		return this.userId;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public long getPhoneNo() {
		return this.phoneNo;
	}

	public String getMessege() {
		return this.messege;
	}

	public int getContactId() {
		return this.contactId;
	}

	public String toString() {
		return ("User ID:" + this.userId + " Name: " + this.name + " Email:" + this.email + " Phone: " + this.phoneNo
				+ " Messege:" + this.messege + " Contact Id:" + this.contactId);

	}
}
