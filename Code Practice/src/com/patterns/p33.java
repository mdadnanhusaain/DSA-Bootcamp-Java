package com.patterns;

import java.util.Scanner;

public class p33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:- ");
        int num = sc.nextInt();
        char k='a';
        for(int i=1 ; i<=num ; i++)
        {
            for(int j=1 ; j<=i; j++)
            {
                System.out.print(k++ + " ");
                k = Character.isUpperCase(k) ? Character.toLowerCase(k) : Character.toUpperCase(k);
            }
            System.out.println();
        }
        sc.close();
    }
}
