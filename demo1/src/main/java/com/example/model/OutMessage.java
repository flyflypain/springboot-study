package com.example.model;

import java.util.Date;

import lombok.Data;

@Data
public class OutMessage {

	private String from;

	private String content;

	private Date dateTime;

	public OutMessage(String content) {
		this.content = content;
	}

}
