package com.functions;

import java.util.Scanner;

public class p6 {
    static int sum = 0;
    void nsum(int num)
    {
        sum += num;
        if(num!=1)
            nsum(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n:- ");
        int n = sc.nextInt();
        p6 p = new p6();
        p.nsum(n);
        System.out.println("Sum of first "+n+" natural nos.= "+sum);
        sc.close();
    }
}
