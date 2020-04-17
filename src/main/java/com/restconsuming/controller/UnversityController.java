package com.restconsuming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restconsuming.model.Request;
import com.restconsuming.model.Response;
import com.restconsuming.service.UniversityService;

@RestController
public class UnversityController {
	@Autowired
	private UniversityService universityService;

	@PostMapping("/createuniversityinfo")
	public Response getUniversityInfo(@RequestBody Request request) {
		System.out.println("callingresponse");
		return universityService.getUniversityInfo(request);

	}
}
