package com.patterns;

import java.util.Scanner;

public class p31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:- ");
        int n = sc.nextInt();
        for(int i=1 ; i<2*n ; i++)
        {
            for(int j=1;j<2*n;j++)
            {
                int d = Math.min(Math.min(i,j),Math.min(2*n-i, 2*n-j));
                System.out.print(n-d+1 + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
