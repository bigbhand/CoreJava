package com.bb.corejava.reflection;

public class CustomUtility {

	private String username;
	public String password;
	protected String role;
	
	public CustomUtility() {
		super();
		System.out.println("Initialized..");
	}
	
	public CustomUtility(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public void printDetails(){
		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
	}

	public String getDetails(){
		return username+" "+password;
	}
	
	public void reinitializeFields(String username, String password){
		this.username="new_"+username;
		this.password="new_"+password;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
