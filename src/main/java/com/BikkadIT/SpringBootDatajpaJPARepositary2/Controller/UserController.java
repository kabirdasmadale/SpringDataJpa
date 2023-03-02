package com.BikkadIT.SpringBootDatajpaJPARepositary2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.BikkadIT.SpringBootDatajpaJPARepositary2.Model.User;
import com.BikkadIT.SpringBootDatajpaJPARepositary2.Service.UserServiceI;

@Controller
public class UserController {
@Autowired
	private UserServiceI userservicei;
public String save(User user) {
	String save = userservicei.save(user);
	return "data save succesfully1";
}
public List<User> saveAllData(List<User> list) {
	List<User> saveAll = userservicei.saveAllData(list);
	return saveAll;
}
public User getUserByUserName(String name) {
	User userByUserName = userservicei.getUserByUserName(name);
	return userByUserName;
}

public User getUserByUserId(int id) {
	User userByUserId = userservicei.getUserByUserId(id);
	return userByUserId;
}
public User getUserByPan(String pan) {
	User byPan = userservicei.getUserByPan(pan);
	return byPan;
}
public List<User> getUserGretterThanEqual(int id) {
	List<User> list = userservicei.getUserGretterThanEqual(id);
	return list;
}
public User getUserByuserId(int id) {
	User user = userservicei.getUserByuserId(id);
	return user;
}
public User getUserByName(String name) {
	User userByName = userservicei.getUserByName(name);
	return userByName;
}
public User logingcheck1(String name, String email) {
	User logingcheck1 = userservicei.logingcheck1(name, email);
	return logingcheck1;
}
public User getUserByIdSql1(int id) {
	User idSql1 = userservicei.getUserByIdSql1(id);
	return idSql1;
}
public User getUserByNamesql(String name) {
	User userByName = userservicei.getUserByName(name);
		return userByName;
	}
}
