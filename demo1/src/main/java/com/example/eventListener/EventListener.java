package com.example.eventListener;

import org.springframework.stereotype.Component;

@Component
public class EventListener implements IEventListener{

	@Override
	public void onEventTriggered(TestEvent event) {
		System.out.println("just to check if it is working");
		if(true == event.clickButton()) {
			System.out.println("clicked button");
		}else if(true == event.moveMouse()) {
			System.out.println("moved mouse");
		}
	}
	
}
