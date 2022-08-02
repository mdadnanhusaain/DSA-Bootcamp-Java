package com.conditions_loop;

import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of 3 sides of triangle:- ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double s = (a+b+c)/2;
        double area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        System.out.println("Area with sides "+a+","+b+" & "+c+" = "+String.format("%.2f", area));
        sc.close();
    }
}
