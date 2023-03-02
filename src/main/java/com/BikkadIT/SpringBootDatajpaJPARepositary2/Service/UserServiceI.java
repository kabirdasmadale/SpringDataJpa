package com.BikkadIT.SpringBootDatajpaJPARepositary2.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.BikkadIT.SpringBootDatajpaJPARepositary2.Model.User;

@Service
public interface UserServiceI {
	public String save(User user);
	
	public List<User> saveAllData(List<User> list);
	public User getUserByUserName(String name);
	public User getUserByUserId(int id);
	public User getUserByPan(String pan);
	public List<User> getUserGretterThanEqual(int id );
	public User getUserByuserId(int id );
	public User getUserByName(String name);
	public User logingcheck1(String name,String email);
	public User getUserByIdSql1(int id );
	public User getUserByNamesql(String name);

}
