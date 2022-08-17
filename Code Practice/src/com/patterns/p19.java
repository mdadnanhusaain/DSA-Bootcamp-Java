package com.patterns;

import java.util.Scanner;

public class p19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:- ");
        int n = sc.nextInt();
        for(int i=1;i<=2*n;i++)
        {
            int t = i>n ? 2*n-i : i;
            for(int j=1;j<=t;j++)
                System.out.print("*");
            for(int k=2*(n-t);k>0;k--)
                System.out.print(" ");
            for(int j=1;j<=t;j++)
                System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}
