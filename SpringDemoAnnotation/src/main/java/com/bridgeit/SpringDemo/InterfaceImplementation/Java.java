package com.bridgeit.SpringDemo.InterfaceImplementation;

import com.bridgeit.SpringDemo.Interface.Language;

public class Java implements Language {

	public String getGreeting() {

		return "Hello JAva";
	}

	public String getBye() {

		return "Byee JAva";
	}
}
