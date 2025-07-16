package org.example;

import org.example.loosecouppling.BinarySearch;
import org.example.tightcoupling.Restaurant;
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

        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(12));
    }
}
