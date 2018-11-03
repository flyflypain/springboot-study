package com.example.model;

import java.util.Date;

import lombok.Data;

@Data
	private String from;

	private String to;

	private String content;

	private Date dateTime;

	private String description;

	public InMessage(String content) {
		this.content = content;
	}

	public InMessage() {
	}
//
//	private InMessage(Builder builder) {
//		this.from = builder.from;
//		this.to = builder.to;
//		this.content = builder.content;
//		this.dateTime = builder.dateTime;
//		this.description = builder.description;
//
//	}
//
//	public static class Builder {
//
//		private String from;
//
//		private String to;
//
//		private String content;
//
//		private Date dateTime;
//
//		private String description;
//
//		public Builder(String content) {
//			this.content = content;
//		}
//
//		public Builder description(String description) {
//			this.description = description;
//			return this;
//		}
//
//		public InMessage build() {
//			return new InMessage(this);
//		}
//
//	}

}
