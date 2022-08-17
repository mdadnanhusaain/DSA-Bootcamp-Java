package com.patterns;

import java.util.Scanner;

public class p34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:- ");
        int n = sc.nextInt();
        char ch = (char)(64+n);
        for(char i=ch ; i>='A' ; i--)
        {
            for(char j=i ; j>= 'A' ; j--)
                System.out.print(j+" ");
            System.out.println();
        }
        sc.close();
    }
}
