package com.example.websocket.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectEvent;

@Component
public class ConnectEventListener implements ApplicationListener<SessionConnectEvent> {

	@Override
	public void onApplicationEvent(SessionConnectEvent event) {

		StompHeaderAccessor stompHeaderAccessor = StompHeaderAccessor.wrap(event.getMessage());
		System.out.println(stompHeaderAccessor.getSessionId());
		System.out.println("【ConnectEventListener监听器事件 类型】" + stompHeaderAccessor.getCommand().getMessageType());

	}

}
