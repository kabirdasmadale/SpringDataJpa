package com.BikkadIT.SpringBootDatajpaJPARepositary2.Repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.BikkadIT.SpringBootDatajpaJPARepositary2.Model.User;

@Repository
public interface UserRepositary extends JpaRepository<User, Integer> {
	public User findByName(String name);
	
	public User findById(int id );
	
	public User findByPan(String pan);
	
	public List<User> findByIdGreaterThanEqual(int id) ;
	@Query("from User where id=:id")
	public User getUserById(int id );
	
	@Query(" from User where name=:name")
	public User getUserByuserName(String name);
	
	@Query("from User where name=:name and email=:email")
	public User logingCheck(String name,String email);
	
	@Query(value="select * from user2 where id=:id",nativeQuery=true)
	public User getUserByIdSql(int id );
	
	@Query(value="select * from user2 where name=:name",nativeQuery=true)
	public User getUserByuserNamesql(String name);
}

