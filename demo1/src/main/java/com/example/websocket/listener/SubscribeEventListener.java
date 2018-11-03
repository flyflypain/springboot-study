package com.example.websocket.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionSubscribeEvent;

@Component
public class SubscribeEventListener implements ApplicationListener<SessionSubscribeEvent> {

	@Override
	public void onApplicationEvent(SessionSubscribeEvent event) {

		// TODO stompHeaderAccessor or SessionSubscribeEvent里还还有一些什么消息，可以用来监听
		StompHeaderAccessor stompHeaderAccessor = StompHeaderAccessor.wrap(event.getMessage());
		System.out.println("【SubscribeEventListener监听器事件 类型】" + stompHeaderAccessor.getCommand().getMessageType());

	}

}
