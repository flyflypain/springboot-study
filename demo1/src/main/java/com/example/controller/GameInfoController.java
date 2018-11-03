package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

import com.example.model.InMessage;
import com.example.websocket.service.WebsocketService;

@Controller
public class GameInfoController {

	@Autowired
	private WebsocketService websockeService;

	@MessageMapping("/v1/chat")
	public void gameInfo(InMessage inMessage) {

		websockeService.sendToTopic("/topic/game_rank", inMessage);

	}
}
