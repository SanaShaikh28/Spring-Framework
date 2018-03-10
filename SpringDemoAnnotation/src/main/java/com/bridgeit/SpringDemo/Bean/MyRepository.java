package com.bridgeit.SpringDemo.Bean;

import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

	public String getAppName() {
		return "Hello String App";
	}

	public Date getSystemDateTime()  {
		return new Date();
	}
}
