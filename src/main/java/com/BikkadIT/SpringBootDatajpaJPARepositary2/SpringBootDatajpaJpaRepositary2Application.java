package com.BikkadIT.SpringBootDatajpaJPARepositary2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.SpringBootDatajpaJPARepositary2.Controller.UserController;
import com.BikkadIT.SpringBootDatajpaJPARepositary2.Model.User;

@SpringBootApplication
public class SpringBootDatajpaJpaRepositary2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDatajpaJpaRepositary2Application.class, args);
	UserController userController = context.getBean(UserController.class);
//	User user=new User();
//	user.setName("kabirdas");
//	user.setAddress("nanded");
//	user.setPan("bavf");
//	user.setEmail("kabir@123");
//	
//	String save = userController.save(user);
//	System.out.println(save);
	
//	User user1=new User();
//	user1.setName("sandip");
//	user1.setAddress("mukhed");
//	user1.setPan("sdref");
//	user1.setEmail("sandip@123");
//	
//	
//	User user2=new User();
//	user2.setName("nagorao");
//	user2.setAddress("hasanal");
//	user2.setPan("mno");
//	user2.setEmail("nagorao@123");
//	
//	
//	User user3=new User();
//	user3.setName("pundalik");
//	user3.setAddress("karla");
//	user3.setPan("khgd");
//	user3.setEmail("pundalik@123");
//	
//	List<User> list=new ArrayList();
//	list.add(user1);
//	list.add(user2);
//	list.add(user3);
//	
//	List<User> list2 = userController.saveAllData(list);
//	System.out.println(list2);
	
	
//	User userByUserName = userController.getUserByUserName("nagorao");
//	System.out.println(userByUserName);
	
//	User id = userController.getUserByUserId(3);
//	System.out.println(id);
	
//	User userByPan = userController.getUserByPan("mno");
//	System.out.println(userByPan);
	
	
//	List<User> equal = userController.getUserGretterThanEqual(3);
//	System.out.println(equal);
	
//	User userByuserId = userController.getUserByuserId(4);
//	System.out.println(userByuserId);
	
//	User name = userController.getUserByName("kabirdas");
//	System.out.println(name);

	
//	User logingcheck1 = userController.logingcheck1("pundalik", "pundalik@123");
//	System.out.println(logingcheck1);
	
//	User userByIdSql1 = userController.getUserByIdSql1(4);
//	System.out.println(userByIdSql1);
	
	User name = userController.getUserByName("pundalik");
	System.out.println(name);
	}

}
