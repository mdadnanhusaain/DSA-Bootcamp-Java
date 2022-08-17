package com.patterns;

import java.util.Scanner;

public class p16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:- ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String s = Integer.toString((int)Math.pow(11,i));
            for(int j=n;j>i;j--)
                System.out.print("  ");
            for(int k=0;k<s.length();k++)
                System.out.print(s.charAt(k)+ "   ");
            System.out.println();
        }
        sc.close();
    }
}
