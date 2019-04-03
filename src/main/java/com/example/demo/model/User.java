/**
 * 
 */
package com.example.demo.model;

import java.io.Serializable;

/**
 * @author lihf
 *
 */
public class User implements Serializable {
	
	/**
	 * add comment
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String password;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
