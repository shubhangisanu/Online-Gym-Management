package com.obj.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.obj.entity.CustomerDetailsEntity;
import com.obj.entity.LoginEntity;
import com.obj.entity.PackageEntity;
import com.obj.entity.User;
import com.obj.service.CustomerDetailsService;
import com.obj.service.PackageService;
import com.obj.service.UserService;
@CrossOrigin(origins="http://localhost:3000")


@RestController
public class UserController {
	
	@Autowired
	UserService userv;
	@Autowired
	PackageService packserv;
	
	@Autowired
	CustomerDetailsService custServ;
	
	
	@GetMapping("/getalluser")
	
	public List<User> getAllProduct()
	{
		return userv.getAllUser();
	}

	@PostMapping("/loginCheck")
	public User loginCheck(@RequestBody LoginEntity obj)
	{
		return userv.getByUname(obj.getEmail(),obj.getPassword() ).get(0);
	}
	
	
	@PostMapping("/login")
	public List<User> getByUname(@RequestParam String email,@RequestParam String password)
	{
		return userv.getByUname(email, password);
	}
	
	@PostMapping("/registration")
	public User saveUser(@RequestBody User userobj)
	{
		return userv.saveUser(userobj);
	}
	
	
	/*Package Controllers*/
	
	@GetMapping("/allPackage")
	public List<PackageEntity>showAllPackage()
	{
		return packserv.showAllPackage();
	}
	
	@PostMapping("/insertPackage")
	public PackageEntity SavePackage(@RequestBody PackageEntity obj)
	{
		return packserv.SavePackage(obj);
	}
	@DeleteMapping("/deletePackage")
	public void deletePackage(@RequestParam int packageid)
	{
		packserv.deletePackage(packageid);
	}
	@PutMapping("/updatePackage")
	
	private PackageEntity update(@RequestBody PackageEntity pack)   
	{  
		return packserv.SavePackage(pack) ;
	
	}  
	
/*Customer Details*/
	
		@GetMapping("/getallCustDetail")
		public List<CustomerDetailsEntity >getAllCustDetail()
		{
			return custServ.getAllCustDetail();
		}
		
		@PostMapping("/insertCustDetail")
		public CustomerDetailsEntity saveCustDetail(@RequestBody CustomerDetailsEntity obj)
		{
			return custServ.savecustDetail(obj);
		}
//		@GetMapping("/getByCustId/{customerdetailsid}")
//		public CustomerDetailsEntity getByCustId(@PathVariable int customerdetailsid)
//		{
//			return custServ.getByCustId(customerdetailsid);
//		}
}
