package com.conditions_loop;

import java.util.*;
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of the circle:- ");
        double r = sc.nextDouble();
        double a = Math.PI*r*r;
        System.out.println("Area of circle with radius "+r+" = "+String.format("%.2f", a));
        sc.close();
    }
}