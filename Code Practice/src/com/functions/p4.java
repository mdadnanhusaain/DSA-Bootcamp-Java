package com.functions;

import java.util.Scanner;

public class p4 {
    boolean pyth(int a, int b, int c)
    {
        return a*a+b*b==c*c?true:false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers:- ");
        System.out.print("No. 1:- ");
        int a = sc.nextInt();
        System.out.print("No. 2:- ");
        int b = sc.nextInt();
        System.out.print("No. 3:- ");
        int c = sc.nextInt();
        p4 p = new p4();
        System.out.println(a+","+b+" & "+c+" are "+(p.pyth(a,b,c)?"a":"not a")+" Pythagoras Triplet");
        sc.close();
    }
}
