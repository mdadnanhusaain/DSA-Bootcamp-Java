package com.first_java;

import java.util.*;
public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no.:- ");
        double n1 = sc.nextDouble();
        System.out.print("Enter 2nd no.:- ");
        double n2 = sc.nextDouble();
        System.out.print("Enter the operation to perform(+,-,*,/) :- ");
        char ch = sc.next().charAt(0);
        if(ch == '+')
            System.out.println("Addition of "+n1+" & "+n2+" = "+(n1+n2));
        else if(ch == '-')
            System.out.println("Subtraction of "+n1+" & "+n2+" = "+(n1-n2));
        else if(ch == '*')
            System.out.println("Multiplication of "+n1+" & "+n2+" = "+(n1*n2));
        else if(ch == '/')
            System.out.println("Division of "+n1+" & "+n2+" = "+(n1/n2));
        else
            System.out.println("INVALID INPUT!!!");
        sc.close();
    }
}
