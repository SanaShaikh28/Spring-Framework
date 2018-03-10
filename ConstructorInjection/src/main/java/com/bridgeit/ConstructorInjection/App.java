package com.bridgeit.ConstructorInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bridgeit.bean.Employee;

/**
 * Purpose: This class gets the bean from the beans.xml file and calls the show
 * method.
 * 
 * @author SANA SHAIKh
 *
 */
public class App {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee emp = (Employee) factory.getBean("employeeBean");

		emp.show();
	}
}
