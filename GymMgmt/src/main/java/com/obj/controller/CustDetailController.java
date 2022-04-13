package com.obj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.obj.entity.CustomerDetailsEntity;
import com.obj.entity.PackageEntity;
import com.obj.service.CustomerDetailsService;

@RestController
public class CustDetailController {
	
	@Autowired
	CustomerDetailsService custServ;
	
	
	
	
	
}
