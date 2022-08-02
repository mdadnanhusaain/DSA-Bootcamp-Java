package com.functions;

import java.util.Scanner;

public class p3 {
    boolean palin(int num)
    {
        int ld,rev=0,n1 = num;
        while(n1!=0)
        {
            ld = n1%10;
            rev = rev*10 + ld;
            n1 /= 10;
        }
        return rev == num ? true : false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int num = sc.nextInt();
        p3 p = new p3();
        System.out.println(num+" is "+(p.palin(num)?"a palindrome ":"not a palindrome ")+"number");
        sc.close();
    }
}
