package com.pysam.mailing.service;

import org.springframework.stereotype.Service;

@Service("mailApiService")

public class MailApiService {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String sayHello() {
		return "Hello! " + name;
	}
}
