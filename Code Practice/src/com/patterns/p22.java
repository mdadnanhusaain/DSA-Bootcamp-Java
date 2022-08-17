package com.patterns;

import java.util.Scanner;

public class p22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:- ");
        int p=1,n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            p = i%2==0?1:0;
            for(int j=0;j<=i;j++)
            {
                System.out.print(p+" ");
                p = p==0?1:0;
            }
            System.out.println();
        }
        sc.close();
    }
}
