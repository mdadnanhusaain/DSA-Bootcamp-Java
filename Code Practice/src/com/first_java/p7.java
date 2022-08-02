package com.first_java;

import java.util.*;;
public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Fibonacci Series:- ");
        int a = 0,b = 1,c,n = sc.nextInt();
        if(n < 1)
            System.out.println(n + " is an INVALID input");
        if(n >= 1)
            System.out.println(a);
        if(n >= 2)
            System.out.println(b);
        if(n >= 3)  {
            for(int i = 2; i <= n; i++)
            {
                c = a+b;
                System.out.println(c);
                a = b;
                b = c;
            }
        }
        sc.close();
    }
}
