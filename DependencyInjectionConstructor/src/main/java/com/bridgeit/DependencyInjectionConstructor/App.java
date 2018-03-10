package com.bridgeit.DependencyInjectionConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.ShapeBean.Geometry;

/**
 * Purpose:In this program dependency of an object is injected via constructor.
 * The following is an example of Geometry and Circle class in which the object
 * of Circle class is injected as a constructor argument.
 *
 */
public class App {
	public static void main(String[] args) {
		// System.out.println( "Hello World!" );

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

		Geometry geometryBean1 = applicationContext.getBean("geometryBean", Geometry.class);
		geometryBean1.drawShape();
	}
}
