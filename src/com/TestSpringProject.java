package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args){
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		Restaurant restaurantObj=(Restaurant)context.getBean("restaurantBean");
		//restaurantObj.prepareHotDrink();
		restaurantObj.greed();
		context.registerShutdownHook();
	}
}
