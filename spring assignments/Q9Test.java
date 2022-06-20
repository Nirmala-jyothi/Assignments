package com.q9all;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Q9Test {
	
	public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("life.xml");
        context.registerShutdownHook();

        BeanLifeCycle beanLifeCycle=(BeanLifeCycle)context.getBean("LifeCycle");
        beanLifeCycle.display();
    }

}
