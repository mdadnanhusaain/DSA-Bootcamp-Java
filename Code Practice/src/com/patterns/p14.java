package com.patterns;

import java.util.Scanner;

public class p14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:- ");
        int n = sc.nextInt();
        for(int i=n-1;i>=0;i--)
        {
            for(int j=n;j>i;j--)
                System.out.print(" ");
            for(int k=2*i+1;k>0;k--)
                if(k==1 || k==2*i+1 || i==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
        sc.close();
    }
}
