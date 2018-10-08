package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.common.IdNotFoundException;
import com.example.domain.ShoppingLists;
import com.example.eventListener.EventListener;
import com.example.eventListener.IEventListener;
import com.example.eventListener.TestEvent;

//@RestController
@Controller
public class HelloController {
	
//	@Autowired
//	private AbstractHelloService helloservice;

	@Autowired
	private ShoppingLists shoppingLists;
	
//	@RequestMapping(value= "/hello/{id}", method = RequestMethod.GET, produces="application/json")
//	public ResponseEntity<BuliderPrac> getById(@PathVariable("id") String id) {
//		
//		List<String> shoppingList = shoppingLists.getShoppingLists();
//		Map<String, BuliderPrac> responseMap = new HashMap<String, BuliderPrac>();
//		
//		shoppingList.stream().forEach(str -> responseMap.put(str, new BuliderPrac.Builder(str).age(30).bulid()));
//		
//		BuliderPrac result = responseMap.get(id);
//		
//		if(result == null) {
//			throw new IdNotFoundException(id);
//		}
//		return new ResponseEntity<BuliderPrac>(result,HttpStatus.OK);
//	}
	
	@Autowired
	public TestEvent event;
	
	@GetMapping("/index")
	public String index() {
		System.out.println("in index");
		event.onMoveMouse();
		return "/index";
	}
	
	
}
