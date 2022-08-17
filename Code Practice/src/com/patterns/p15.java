package com.patterns;

import java.util.Scanner;

public class p15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:- ");
        int n = sc.nextInt();
        for(int i=0;i<=2*n;i++)
        {
            int t = i>n ? 2*n-i : i;
            for(int j=n;j>t;j--)
                System.out.print(" ");
            for(int k=0;k<=2*t;k++)
                if(k==0 || k==2*t)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
        sc.close();
    }
}