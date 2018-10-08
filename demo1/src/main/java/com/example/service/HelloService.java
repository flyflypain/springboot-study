package com.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("default")
public class HelloService implements AbstractHelloService  {

	@Value("${self.msg}")
	private String msg;
	
	@Override
	public String getService() {
		return msg;
	}
}

