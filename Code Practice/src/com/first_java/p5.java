package com.first_java;

import java.util.*;
public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to compare:- ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("The largest between "+d1+" & "+d2+" is "+(d1>d2?d1:d2));
        sc.close();
    }
}
