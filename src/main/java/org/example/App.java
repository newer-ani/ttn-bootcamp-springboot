package org.example;

import org.example.loosecouppling.BinarySearch;
import org.example.tightcoupling.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{

    public static void main( String[] args )
    {
        Restaurant restaurant = new Restaurant();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        String choice = sc.next();
        restaurant.orderSomething(choice);

        //BinarySearch binarySearch = new BinarySearch();

        ApplicationContext context = SpringApplication.run(App.class, args);
        BinarySearch binarySearch1 = context.getBean(BinarySearch.class);
       // System.out.println(binarySearch.search(12));
        System.out.println(binarySearch1.search(12));
    }
}
