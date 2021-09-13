package org.example;
import java.util.Scanner;
import java.util.Date;
/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Jose Malave
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.println( "How many people?" );
        String people= sc.nextLine();
        System.out.println( "How many pizzas do you have?" );
        String pizzas= sc.nextLine();
        int i=Integer.parseInt(people);
        int y=Integer.parseInt(pizzas);

        int slicesTotal= (y * 8);
        int sliceCount= (slicesTotal / i);
        int remainder= (slicesTotal%i);
        System.out.println( i + " people with " + y + " pizzas ("+slicesTotal+" slices)\n" +
                "Each person gets" + sliceCount +" pieces of pizza.\n" +
                "There are "+ remainder + " leftover pieces.");
    }
}
