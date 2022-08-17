package com.patterns;

import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:- ");
        int n = sc.nextInt();
        for(int i=n-1;i>=0;i--)
        {
            for(int k=0;k<n-i-1;k++)
                System.out.print(" ");
            for(int j=2*i-1;j>0;j--)
                System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}
