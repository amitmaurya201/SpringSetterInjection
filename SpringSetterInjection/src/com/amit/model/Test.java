package com.amit.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("amit.xml");
		 Student student1=(Student) context.getBean("Student1");
		 System.out.println(student1);

	}
}
