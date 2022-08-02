package com.conditions_loop;

import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:- ");
        int n = sc.nextInt();
        System.out.println("Enter value of r:- ");
        int r = sc.nextInt();
        if(n>=r || n < 1 || r < 1)
        {
            int nf=1,rf=1,df=1;
            for(int i=1;i<=n;i++)
            {
                nf *= i;
                if(i <= r)
                    rf *= i;
                if(i <= (n-r) )
                    df *= i;
            }
            int npr = nf/df;
            int ncr = nf/(df*rf);
            System.out.println("Permutation:- "+npr+"\nCombination:- "+ncr);
        }
        else
            System.out.println("INVALID INPUTS!!!");
        sc.close();
    }
}
