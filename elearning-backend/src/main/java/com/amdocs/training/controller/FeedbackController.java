package com.amdocs.training.controller;

import java.util.List;

import com.amdocs.training.dao.FeedbackDAO;
import com.amdocs.training.dao.impl.FeedbackDaoImpl;
import com.amdocs.training.model.Feedback;

public class FeedbackController {

	public static void main(String[] args) {
		FeedbackDAO dao = new FeedbackDaoImpl();
		// dao.addfeedback();
		// dao.updatefeedback();
		// dao.deletefeedback();
		List<Feedback> feedbacks = dao.findAll();
		if (feedbacks.isEmpty()) {
			System.out.println("Empty set!");
		} else {
			feedbacks.forEach(System.out::println);
		}

	}

}
