package com.patterns;

import java.util.Scanner;

public class p20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:- ");
        int n = sc.nextInt();
        for(int i=1;i<2*n;i++)
        {
            for(int j=1;j<2*n-1;j++)
            {
                if(j==1 || j==2*n-2 || i==1 || i==2*n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
