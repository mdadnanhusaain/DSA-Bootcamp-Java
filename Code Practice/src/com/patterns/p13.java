package com.patterns;

import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:- ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>i;j--)
                System.out.print(" ");
            for(int k=0;k<2*i+1;k++)
                if(k==0 || k>=2*(i) || i==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
        sc.close();
    }
}
