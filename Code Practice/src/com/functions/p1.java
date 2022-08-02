package com.functions;

import java.util.Scanner;

public class p1 {
    int maxi(int a, int b, int c)
    {
        return a>b ? a>c?a:c : b>c?b:c;
    }
    int mini(int a, int b, int c)
    {
        return a<b ? a<c?a:c : b<c?b:c;
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
        p1 p = new p1();
        System.out.println("Max="+p.maxi(a, b, c)+" Min="+p.mini(a, b, c));
        sc.close();
    }
}
