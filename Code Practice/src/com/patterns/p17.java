package com.patterns;

import java.util.Scanner;

public class p17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:- ");
        int n = sc.nextInt();
        for(int i=1 ; i<2*n ; i++)
        {
            int t = i>n ? 2*n-i : i;
            for(int j=n-t ; j>=0 ; j--)
                System.out.print("  ");
            for(int j=t;j>0;j--)
                System.out.print(j + " ");
            for(int j=2;j<=t;j++)
                System.out.print(j + " ");
            System.out.println();
        }
        sc.close();
    }
}
