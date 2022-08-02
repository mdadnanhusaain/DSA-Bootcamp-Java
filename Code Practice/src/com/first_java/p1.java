package com.first_java;

import java.util.*;
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check for even odd:- ");
        int num = sc.nextInt();
        sc.close();
        if(num%2==0)
            System.out.println(num+" is an even number");
        else
            System.out.println(num+" is an odd number");
    }
}