package com.example.eventListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class TestEvent {

	@Autowired
	private EventListener eventListener;
	
	private boolean mouse;
	private boolean button;
//	
//	public void setEventListener(EventListener e) {
//		this.eventListener = e;
//	}
	
	public boolean clickButton() {
		return button;
	}
	
	public boolean moveMouse() {
		return mouse;
	}
	
	public void onMoveMouse() {
		this.mouse = true;
		eventListener.onEventTriggered(this);
	}
	
	public void onClickButton() {
		this.button = true;
		eventListener.onEventTriggered(this);
	}
}
