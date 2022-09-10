package com.retocrud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class user {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String userName;
	private String password;
	private String completeName;
	private String email;
			
	public user() {
		super();
	}
	
	public user(Integer id, String userName, String password, String completeName, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.completeName = completeName;
		this.email = email;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCompleteName() {
		return completeName;
	}
	public void setCompleteName(String completeName) {
		this.completeName = completeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "user [id=" + id + ", userName=" + userName + ", password=" + password + ", completeName=" + completeName
				+ ", email=" + email + "]";
	}
	
	
	
	
}


