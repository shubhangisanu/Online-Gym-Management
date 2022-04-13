package com.obj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	@Column
	private String fname;
	private String lname;
	private String email;
	private String password;
	private String contactno;
	private String usertype;
	private String address;
	private String gender;
	private String birthdate;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String fname, String lname, String email, String password, String contactno, String usertype,
			String address, String gender, String birthdate) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.contactno = contactno;
		this.usertype = usertype;
		this.address = address;
		this.gender = gender;
		this.birthdate = birthdate;
	}

	public User(int userid, String fname, String lname, String email, String password,
			String contactno, String usertype, String address, String gender, String birthdate) {
		super();
		this.userid = userid;
		
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.contactno = contactno;
		this.usertype = usertype;
		this.address = address;
		this.gender = gender;
		this.birthdate =birthdate;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setDate(String birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid  + ", fname=" + fname + ", lname=" + lname
				+ ", email=" + email + ", password=" + password + ", contactno=" + contactno + ", usertype=" + usertype
				+ ", address=" + address + ", gender=" + gender + ", birthdate=" + birthdate + ", getUserid()=" + getUserid()
				 + ", getFname()=" + getFname() + ", getLname()=" + getLname()
				+ ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword() + ", getContactno()="
				+ getContactno() + ", getUsertype()=" + getUsertype() + ", getAddress()=" + getAddress()
				+ ", getGender()=" + getGender() + ", getDate()=" + getBirthdate() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
