package com.obj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.obj.entity.CustomerDetailsEntity;
import com.obj.repository.CustomerDetailsRepo;

@Service
public class CustomerDetailsService {

	@Autowired
	CustomerDetailsRepo custrepo;
	
	public List<CustomerDetailsEntity>getAllCustDetail()
	{
		return custrepo.findAll();
	}
	
	public CustomerDetailsEntity savecustDetail(CustomerDetailsEntity  obj)
	{
		return custrepo.save(obj);
	}
}
