package com.BikkadIT.SpringBootDatajpaJPARepositary2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.SpringBootDatajpaJPARepositary2.Model.User;
import com.BikkadIT.SpringBootDatajpaJPARepositary2.Repositary.UserRepositary;

@Service
public class UserServiceIMPL implements UserServiceI {
	@Autowired
	private UserRepositary userrepositary;

	@Override
	public String save(User user) {
		User save = userrepositary.save(user);
		return "data save succesfully";
	}

	@Override
	public List<User> saveAllData(List<User> list) {
		List<User> all = userrepositary.saveAll(list);
		return all;
	}

	@Override
	public User getUserByUserName(String name) {
		User name2 = userrepositary.findByName(name);
		return name2;
	}

	@Override
	public User getUserByUserId(int id) {
		User findById = userrepositary.findById(id);
		return findById;
	}

	@Override
	public User getUserByPan(String pan) {
		User pan2 = userrepositary.findByPan(pan);
		return pan2;
	}

	@Override
	public List<User> getUserGretterThanEqual(int id) {
		List<User> findByIdGreterThanEqual = userrepositary.findByIdGreaterThanEqual(id);
		return findByIdGreterThanEqual;
	}

	@Override
	public User getUserByuserId(int id) {
		User id2 = userrepositary.getUserById(id);
		return id2;
	}

	@Override
	public User getUserByName(String name) {
		User user = userrepositary.getUserByuserName(name);
		return user;
	}

	@Override
	public User logingcheck1(String name, String email) {
		User check = userrepositary.logingCheck(name, email);
		return check;
	}

	@Override
	public User getUserByIdSql1(int id) {
		User idSql = userrepositary.getUserByIdSql(id);
		return idSql;
	}

	@Override
	public User getUserByNamesql(String name) {
	User namesql = userrepositary.getUserByuserNamesql(name);
		return namesql;
	}
	

}
