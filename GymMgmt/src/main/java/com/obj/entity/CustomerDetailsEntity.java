package com.obj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customerdetails")
public class CustomerDetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerdetailsid;
	@Column
	private int userid;
	private String joindate;
	private int height;
	private int weight;
	private String medicalhistory;
	private String gympackage;
	
	public CustomerDetailsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerDetailsEntity(int customerdetailsid, int userid, String joindate, int height, int weight,
			String medicalhistory, String gympackage) {
		super();
		this.customerdetailsid = customerdetailsid;
		this.userid = userid;
		this.joindate = joindate;
		this.height = height;
		this.weight = weight;
		this.medicalhistory = medicalhistory;
		this.gympackage = gympackage;
	}

	public CustomerDetailsEntity(int userid, String joindate, int height, int weight, String medicalhistory,
			String gympackage) {
		super();
		this.userid = userid;
		this.joindate = joindate;
		this.height = height;
		this.weight = weight;
		this.medicalhistory = medicalhistory;
		this.gympackage = gympackage;
	}

	public int getCustomerdetailsid() {
		return customerdetailsid;
	}

	public void setCustomerdetailsid(int customerdetailsid) {
		this.customerdetailsid = customerdetailsid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getJoindate() {
		return joindate;
	}

	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getMedicalhistory() {
		return medicalhistory;
	}

	public void setMedicalhistory(String medicalhistory) {
		this.medicalhistory = medicalhistory;
	}

	public String getGympackage() {
		return gympackage;
	}

	public void setGympackage(String gympackage) {
		this.gympackage = gympackage;
	}
	
	
	

}
