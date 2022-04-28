package com.example.project.bajaj.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDetails {

	@JsonProperty("is_success")
	private Boolean isSuccess;
	
	@JsonProperty("user_id")
	private String userId;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("roll_number")
	private String rollNumber;
	
	@JsonProperty("numbers")
	private List<String> numbers;
	
	@JsonProperty("alphabets")
	private List<String> alphabest;

	public Boolean getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public List<String> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<String> numbers) {
		this.numbers = numbers;
	}

	public List<String> getAlphabest() {
		return alphabest;
	}

	public void setAlphabest(List<String> alphabest) {
		this.alphabest = alphabest;
	}
}
