package com.obj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.obj.entity.LoginEntity;
import com.obj.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value="select * from user where email =?1 and password=?2",nativeQuery = true)
	public List<User> getByUname(String email, String password);
	
	
}
