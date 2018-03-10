package com.bridgeit.SpringDemo.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgeit.SpringDemo.Interface.Language;

@Service
public class GreetingService {
	
	@Autowired
	private Language language;

	public GreetingService() {
	
	}
	
	public void sayGreeting(){
		
		String greeting=language.getGreeting();
		System.out.println("Greeting:"+greeting);
	}
}
