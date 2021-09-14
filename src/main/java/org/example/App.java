/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander Williams
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner (System.in);

        System.out.print("What is your age? ");
        int age = scan.nextInt();

        String result = (age >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.println(result);
    }
}
