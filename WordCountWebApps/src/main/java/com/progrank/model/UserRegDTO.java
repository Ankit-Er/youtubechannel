package com.progrank.model;

public class UserRegDTO {
	
	private String userName;
	private String userEmail;
	private String password;
	private String country;
	private char gender;

	private String msg;
	
	public UserRegDTO() {}
	
	public UserRegDTO(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getuserName() {
		return userName;
	}
	public void setuserName(String userName) {
		this.userName = userName;
	}
	public String getuserEmail() {
		return userEmail;
	}
	public void setuserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "UserRegDTO [userName=" + userName + ", userEmail=" + userEmail + ", password=" + password + ", country=" + country
				+ ", gender=" + gender + "]";
	}
	
}
