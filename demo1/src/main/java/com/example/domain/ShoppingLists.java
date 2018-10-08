package com.example.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix="my.shoppinglists")
@Data
public class ShoppingLists {

	private List<String> shoppingLists;
	
	private int id;
	

}
