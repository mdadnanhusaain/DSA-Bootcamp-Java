package com.first_java;

import java.util.*;
public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(("Enter currency value(in Rupees):- "));
        double inr = sc.nextDouble();
        double usd = inr / (79.91);
        System.out.println("Rs."+inr+" = $" +String.format("%.2f", usd));
        sc.close();
    }
}