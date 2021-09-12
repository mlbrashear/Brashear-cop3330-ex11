package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables
        double euro, rate, us;
        Scanner sc = new Scanner(System.in);

        //Take in user input
        System.out.println("How many euros are you exchanging?");
        euro = sc.nextDouble();
        System.out.println("What is the exchange rate?");
        rate = sc.nextDouble();

        //calculate exchange rate and round
        us = rate * euro;
        us = Math.round(us*100.0)/100.0;

        //print out findings
        System.out.println((int) euro + " euros at an exchange rate of " + rate + " is\n" + us + " U.S. dollars.");

        sc.close();
    }
}