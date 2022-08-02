package com.functions;

import java.util.Scanner;

public class p5 {
    void prime(int a, int b)
    {
        for(int i = a; i <= b; i++)
        {
            int ch = 1;
            for(int j=2; j <= i/2; j++)
            {
                if(i%j==0)
                {
                    ch = 0;
                    break;
                }
            }
            if(ch==1)
                System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower limit:- ");
        int a = sc.nextInt();
        System.out.print("Enter the upper limit:- ");
        int b = sc.nextInt();
        p5 p = new p5();
        p.prime(a,b);
        sc.close();
    }
}
