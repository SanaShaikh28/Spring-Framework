package com.bridgeit.SpringDemo.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bridgeit.SpringDemo.Bean.Student;

@SuppressWarnings("deprecation")
public class App 
{ 
	public static void main( String[] args )
    {
        Resource resource=new ClassPathResource("AppConfig.xml");
        BeanFactory beanFactory=new XmlBeanFactory(resource);
        
        Student student=(Student) beanFactory.getBean("studentBean");
		student.displayInfo();
    }
}
