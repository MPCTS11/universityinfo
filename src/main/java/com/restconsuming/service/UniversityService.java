package com.restconsuming.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.restconsuming.model.Request;
import com.restconsuming.model.Response;

@Service
public class UniversityService {

	@Value("${rest.createdept.endpoint}")
	private String createEndpoint;

	public Response getUniversityInfo(Request request) {
		System.out.println(request);
		HttpHeaders header=new HttpHeaders();
		header.set("Content-Type", "application/json");
		
		HttpEntity<String> entity=new HttpEntity<>(request.toString(),header);
		System.out.println("endpoint    -->" + createEndpoint);
		RestTemplate resttemplate = new RestTemplate();

		ResponseEntity<Response>  res = resttemplate.exchange(createEndpoint,HttpMethod.POST ,entity, Response.class);

		return res.getBody();

	}

}
