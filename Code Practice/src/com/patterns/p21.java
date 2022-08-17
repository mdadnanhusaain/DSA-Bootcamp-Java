package com.patterns;

import java.util.Scanner;

public class p21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:- ");
        int k=0,n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
                System.out.print(++k + " ".repeat(2-(int)Math.log10(k)) );
            System.out.println();
        }
        sc.close();
    }
}
