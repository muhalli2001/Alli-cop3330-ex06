package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
import java.util.Scanner;
import java.util.*;
public class App {
    public static void main(String[] args) {

        Scanner age = new Scanner(System.in);
        System.out.println("What is your age?");
        String Age = age.nextLine();
        int AGE = Integer.parseInt(Age);

        Scanner r = new Scanner(System.in);
        System.out.println("Retirement Age?");
        String retire = r.nextLine();
        int RETIREMENT = Integer.parseInt(retire);


        int timeleft = RETIREMENT - AGE;
        if(RETIREMENT<AGE){System.out.println("not possible"); return;}
        else System.out.println("you have "+timeleft+" years until you retire");
        int year =  Calendar.getInstance().get(Calendar.YEAR);
        int retireyear = year + timeleft;
        System.out.println("its "+year+" so you can retire in "+ retireyear);
    }
}
