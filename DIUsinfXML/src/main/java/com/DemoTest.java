package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		//Employee e=(Employee)ac.getBean("emp1");
		//System.out.println(e);
		Employee e1=(Employee)ac.getBean("emp2");
		System.out.println(e1);
		Employee e2=(Employee)ac.getBean("emp3");
		System.out.println(e2);
	}

}
