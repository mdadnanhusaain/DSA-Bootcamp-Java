package com.conditions_loop;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length & breadth of rectanlge:- ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of rectanlge = "+l*b);
        sc.close();
    }
}
