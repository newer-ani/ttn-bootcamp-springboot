package org.example;

import org.example.loosecouppling.BinarySearch;
import org.example.tightcoupling.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan
public class App 
{

    public static void main( String[] args )
    {
        Restaurant restaurant = new Restaurant();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        String choice = sc.next();
        restaurant.orderSomething(choice);

       // BinarySearch binarySearch = new BinarySearch();

         ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        BinarySearch binarySearch1 = context.getBean(BinarySearch.class);    //answer for Q4
       // System.out.println(binarySearch.search(12));
        System.out.println(binarySearch1.search(12)); 
    }
}
