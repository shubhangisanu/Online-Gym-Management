package com.obj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obj.entity.PackageEntity;
import com.obj.repository.PackageRepository;

@Service
public class PackageService {
	
	@Autowired
	PackageRepository packrepo;
	
	//List All Packages
	public List<PackageEntity>showAllPackage()
	{
		return packrepo.findAll();
	}
	//Insert New Package
	public PackageEntity SavePackage(PackageEntity obj)
	{
		return packrepo.save(obj);
	}
	//Delete Package
	public void deletePackage(int packageid)
	{
		packrepo.deleteById(packageid);
	}
	
	//Update Package
	public void update(PackageEntity pack, int packageid)   
	{  
		packrepo.save(pack);  
	}  
}
