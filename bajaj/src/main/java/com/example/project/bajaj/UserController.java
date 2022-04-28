package com.example.project.bajaj;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.bajaj.bean.Request;
import com.example.project.bajaj.bean.UserDetails;

@RestController
public class UserController {

	@RequestMapping(method = RequestMethod.POST, value = "/bfhl")
	public UserDetails userDetails(@RequestBody Request request) {
		UserDetails userDetails = new UserDetails();
		userDetails.setIsSuccess(true);
		userDetails.setUserId("john_doe_17091999");
		userDetails.setEmail("john@xyz.com");
		userDetails.setRollNumber("ABCD123");
		
		ArrayList<String> numbers = new ArrayList<>();
		ArrayList<String> alphabets = new ArrayList<>();
		request.getData().forEach(value -> {
			if (value.chars().allMatch( Character::isDigit )) 
				numbers.add(value);
			else
				alphabets.add(value);
		});
		
		userDetails.setNumbers(numbers);
		userDetails.setAlphabest(alphabets);
		return userDetails;
	}
}
