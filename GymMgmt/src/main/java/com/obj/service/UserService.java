package com.obj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obj.entity.LoginEntity;
import com.obj.entity.User;
import com.obj.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userrepo;
	
	
	public List<User>getAllUser()
	{
		return userrepo.findAll();
	}
	public List<User>getByUname(String email, String password)
	{
		return userrepo.getByUname(email,password);
	}
	
	
	public User saveUser(User userdata)
	{
		return userrepo.save(userdata);
	}
}
