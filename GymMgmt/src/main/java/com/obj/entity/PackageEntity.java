package com.obj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="package")
public class PackageEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int packageid;
	@Column
	private String packagename;
	private String description;
	private int duration;
	private double price;
	
	public PackageEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PackageEntity(int packageid, String packagename, String description, int duration, double price) {
		super();
		this.packageid = packageid;
		this.packagename = packagename;
		this.description = description;
		this.duration = duration;
		this.price = price;
	}

	public PackageEntity(String packagename, String description, int duration, double price) {
		super();
		this.packagename = packagename;
		this.description = description;
		this.duration = duration;
		this.price = price;
	}

	public int getPackageid() {
		return packageid;
	}

	public void setPackageid(int packageid) {
		this.packageid = packageid;
	}

	public String getPackagename() {
		return packagename;
	}

	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Package [packageid=" + packageid + ", packagename=" + packagename + ", description=" + description
				+ ", duration=" + duration + ", price=" + price + "]";
	}
	
	

}
