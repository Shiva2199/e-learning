package com.amdocs.training.model;

public class Feedback {
	private int feedbackUserId;
	private String feedbackName;
	private String feedbackEmail;
	private int feedbackId;
	private String feedback;
	
	public Feedback() {
		
	}
	public Feedback(int feedbackUserId, String feedbackName, String feedbackEmail, int feedbackId, String feedback) {
		this.feedbackUserId = feedbackUserId;
		this.feedbackName = feedbackName;
		this.feedbackEmail = feedbackEmail;
		this.feedbackId = feedbackId;
		this.feedback = feedback;
	}

	public void setfeedbackUserId(int id) {
		this.feedbackUserId = id;
	}

	public void setfeedbackName(String name) {
		this.feedbackName = name;
	}

	public void setfeedbackEmail(String email) {
		this.feedbackEmail = email;
	}

	public void setfeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public void setfeedback(String feedback) {
		this.feedback = feedback;
	}

	public int getfeedbackUserId() {
		return this.feedbackUserId;
	}

	public String getfeedbackName() {
		return this.feedbackName;
	}

	public String getfeedbackEmail() {
		return this.feedbackEmail;
	}

	public int getfeedbackId() {
		return this.feedbackId;
	}

	public String getfeedback() {
		return this.feedback;
	}

	public String toString() {
		return ("User Id: " + this.feedbackUserId + " Name: " + this.feedbackName + " Email: " + this.feedbackEmail + " F_Id: " + this.feedbackId
				+ " Feedback: " + this.feedback);
	}
}
