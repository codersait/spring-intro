package com.codersait;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");




        //bu newleme isini IoC yani spring yapacak.
	    CustomerManager manager = new CustomerManager(context.getBean("database",ICustomerDao.class));
	    manager.add();

    }
}
