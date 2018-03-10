package com.bridgeit.SpringDemo.Bean;

import java.io.Serializable;

public class Student implements Serializable {

	private String name;

	public Student() {
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayInfo() {
		
		System.out.println("Hello"+name);
	}

}
