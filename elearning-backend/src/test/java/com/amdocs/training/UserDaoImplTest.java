package com.amdocs.training;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.dao.impl.UserDaoImpl;
import com.amdocs.training.model.User;

class UserDaoImplTest {
	
	static UserDAO dao=null;
	@BeforeAll
	public static void init() {
		dao=new UserDaoImpl();
	}
	@AfterAll
	public static void destory() {
		dao=null;
	}
	@Test
	@Order(value=1)
	void test_find_all_user_success() {
		
		List<User> users=dao.findAll();
		
		assertEquals(10,users.size());
	}
	@Test
	@Order(value=4)
	void test_get_username_success() {
		
		List<User> users=dao.findAll();
		User user=users.get(3);
		
		assertEquals("suhith",user.getName());
		
	}
	@Test
	@Order(value=3)
	void test_add_user_success() {
		
//		User user=new User(119,"Kamal",584584,"kamal@email.com","Chenai","21/10/1960","kamal@123",4848551);
//		
//		assertTrue(dao.addUser(user));
		
	}
	@Test
	@Order(value=2)
	void test_delete_user_success() {
		
//		assertTrue(dao.deleteUser(121));
		
	}
	@Test
	@Order(value=5)
	void test_update_user_success() {
//		User user=new User(1,"Kamal",584584,"kamal@email.com","Chenai","21/10/1960","kamal@123",4848551);
//		assertTrue(dao.updateUser(user));
		
	}
	@Test
	@Order(value=6)
	void test_get_userbyId_success() {
		
		List<User> users=dao.findAll();
		User user=users.get(3);
		System.out.println(user);
		User actualuser=dao.getUserById(112);
		System.out.println(actualuser);
		assertNotNull(actualuser);
		assertEquals(user.getName(),dao.getUserById(112).getName());
		

	}
}
