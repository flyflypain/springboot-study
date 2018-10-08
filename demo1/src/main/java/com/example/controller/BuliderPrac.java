package com.example.controller;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
public class BuliderPrac {

	private final String name;
	private final int age;
	private final String address;
	private final String phone;
	
	private BuliderPrac(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.address = builder.address;
		this.phone = builder.phone;
	}
	
	public static class Builder {
		private final String name;
		private int age;
		private String address;
		private String phone;
		
		public Builder(String name) {
			this.name = name;
		}
		
		public Builder age(int age) {
			this.age = age;
			return this;
		}
		
		public Builder address(String address) {
			this.address = address;
			return this;
		}
		
		public Builder phone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public BuliderPrac bulid() {
			return new BuliderPrac(this);
		}
		
	}
	
}
