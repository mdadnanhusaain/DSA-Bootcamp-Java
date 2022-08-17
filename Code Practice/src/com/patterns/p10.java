package com.patterns;

import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:- ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int k=n;k>i;k--)
                System.out.print(" ");
            for(int j=0;j<i+1;j++)
                System.out.print("* ");
            System.out.println();
        }
        sc.close();
    }
}
