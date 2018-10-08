package com.example.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("mock")
public class HelloServiceMock implements AbstractHelloService {
		
	@Override
	public String getService() {
		return "hello restAPI Mock";
	}
}

