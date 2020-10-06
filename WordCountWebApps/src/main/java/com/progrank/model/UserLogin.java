package com.progrank.model;

public class UserLogin {
	
	private String userName;
	private String userPasswd;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPasswd() {
		return userPasswd;
	}
	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
	}
	
	@Override
	public String toString() {
		return "UserLogin [userName=" + userName + ", userPasswd=" + userPasswd + "]";
	}
	
	
}
