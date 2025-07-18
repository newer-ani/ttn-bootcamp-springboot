package com.ttn.Spring_Boot.Assingments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AssingmentsApplication {

	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(AssingmentsApplication.class, args);


		Check checkKui = context.getBean(Check.class);

		System.out.println("Message: " + checkKui.getGreeting());



		// To answer the Q3 i have create a schema.sql file under the resources section which contains the sql query for answering Q3
	}

}
