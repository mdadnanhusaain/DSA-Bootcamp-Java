package com.first_java;

import java.util.*;
public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle:- ");
        double p = sc.nextDouble();
        System.out.print("Enter the Time(in years):- ");
        double t = sc.nextDouble();
        System.out.print("Enter the Rate of Interest:- ");
        double r = sc.nextDouble();
        double i = p*r*t/100;
        System.out.println("Simple Interest = "+i);
        System.out.println("Amount = "+(p+i));
        sc.close();
    }
}