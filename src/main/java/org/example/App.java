/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Andrew Howard
 */
package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("What is your age? ");
        int userAge = keyboardInput.nextInt();

        if(userAge >= 16 ){
            System.out.print("You are old enough to legally drive. ");
        }
        else{
            System.out.print("You are not old enough to legally drive.");
        }


    }
}
