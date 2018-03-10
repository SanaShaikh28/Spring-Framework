package com.bridgeit.SpringDemo.SpringDemoAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bridgeit.SpringDemo.Bean.GreetingService;
import com.bridgeit.SpringDemo.Bean.MyComponent;
import com.bridgeit.SpringDemo.Config.AppConfig;
import com.bridgeit.SpringDemo.Interface.Language;

public class App {
	public static void main(String[] args) {

		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Language language=(Language) applicationContext.getBean("language");
		System.out.println("Bean Language:"+language);
		System.out.println("Get Bye method:"+language.getBye());
		
		GreetingService greetingService=(GreetingService) applicationContext.getBean("greeting service");
		greetingService.sayGreeting();
		//System.out.println(greetingService.sayGreeting());
		
		MyComponent myComponent=(MyComponent) applicationContext.getBean("MyComponent");
		myComponent.showAppInfo();
	}
}
