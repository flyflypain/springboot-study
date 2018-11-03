package com.example.websocket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import com.example.model.InMessage;
import com.example.model.OutMessage;

/**
 * Socket的简单消息模版
 * 
 * @author lisheng
 *
 */
@Service
public class WebsocketService {

	@Autowired
	private SimpMessagingTemplate template;

	public void sendToTopic(String destination, InMessage inMessage) {
		template.convertAndSend(destination, new OutMessage(inMessage.getContent()));
	}
}
