package com.patterns;

import java.util.Scanner;

public class p25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:- ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int k=n;k>i;k--)
                System.out.print(" ");
            for(int j=0;j<n;j++)
            {
                if(j==0 || j==n-1 || i==0 || i==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
