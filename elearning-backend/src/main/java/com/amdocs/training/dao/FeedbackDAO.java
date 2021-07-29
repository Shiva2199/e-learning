package com.amdocs.training.dao;

import java.util.List;

import com.amdocs.training.model.Feedback;
import com.amdocs.training.model.User;

public interface FeedbackDAO {
	List<Feedback> findAll();

	boolean addfeedback(Feedback feedback);

	boolean deletefeedback(int f_id);

	boolean updatefeedback(Feedback feedback);
	
	Feedback getFeedbackById(int f_id);
//	List<User> findAll();
//	void deleteUser(int id);
//	void updateUser(User user);
//	void addUser(User user);
//	User getUserById(int Id);

}
