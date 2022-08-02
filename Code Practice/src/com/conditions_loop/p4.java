package com.conditions_loop;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter co-ordinates of 1st point");
        System.out.print("x1:- ");
        double x1 = sc.nextDouble();
        System.out.print("y1:- ");
        double y1 = sc.nextDouble();
        System.out.println("Enter co-ordinates of 2nd point");
        System.out.print("x2:- ");
        double x2 = sc.nextDouble();
        System.out.print("y2:- ");
        double y2 = sc.nextDouble();
        double dis = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
        System.out.println("Distance between ("+x1+","+y1+") & ("+x2+","+y2+") = "+String.format("%.2f", dis));
        sc.close();
    }
}
