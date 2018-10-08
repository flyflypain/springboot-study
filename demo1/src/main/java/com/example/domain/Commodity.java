package com.example.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix="my.commodity")
public class Commodity {
	
	private String abbrName;
	
	private String fullName;
	
	private int price;

	private ActiveFlag activetFlag;
}
