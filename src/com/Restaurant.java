package com;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Restaurant {
	IHotDrink hotDrink;
// first method: using the constructor
//	Restaurant(IHotDrink hotDrink){
//		this.hotDrink=hotDrink;
//	}

	// springconfig.xml <property name="hotDrink" ref="teaBean"/>will do the set method automatically
		public void setHotDrink(IHotDrink hotDrink){
			this.hotDrink=hotDrink;
			
		}
	public void prepareHotDrink(){ 
		// no need to initiate a object, it is already done in the SpringConfig
		hotDrink.prepareHotDrink();
	}
	
	public void greed(){
		System.out.println("Hello, welcome to our restaurant");
	}
	//@PostConstruct
	public void init(){
		System.out.println("Bean is initializated");
	}
	
	//@PreDestroy
	public void destroy(){
		System.out.println("Bean is destroyed now");
	}

}
