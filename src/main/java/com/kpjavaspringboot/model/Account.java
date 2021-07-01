package com.kpjavaspringboot.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

//public class Account {
public class Account implements Serializable{
	@Id
    String userid = "";
	
	@Column(name="firstname")
    String firstname = "";   
	
    @Column(name="lastname")
    String lastname = "";
    
    @Column(name="password")
    String password = "";	
    
    @Column(name="email")
    String email = "";
    
    @Column(name="lastlogin")
    Date lastlogin = new Date();;
      
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
			
	public Account(String userid, String firstname, String lastname, String password, String email, Date lastlogin) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.lastlogin = lastlogin;
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getUserid() {
		return userid;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	
	public String getFirstName() {
		return firstname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}	
	
	public String getLastName() {
		return lastname;
	}	
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

	public void setLastLogin(Date lastlogin) {
		this.lastlogin = lastlogin;
	}
	
	public Date getLastLogin() {
		return lastlogin;
	}

}
