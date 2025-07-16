package org.example;

import org.example.coupling.Restaurant;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Restaurant restaurant = new Restaurant();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        String choice = sc.next();
        restaurant.orderSomething(choice);
    }
}
