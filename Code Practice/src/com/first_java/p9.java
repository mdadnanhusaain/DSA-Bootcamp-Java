package com.first_java;

import java.util.*;
public class p9 {
    static boolean check(int num)
    {
        int ld,sum=0,n1 = num;
        while(n1 != 0)
        {
            ld = n1%10;
            sum += Math.pow(ld,3);
            n1 /= 10;
        }
        return sum==num?true:false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Lower limit:- ");
        int l = sc.nextInt();
        System.out.print("Enter the Upper limit:- ");
        int ch = 0, u = sc.nextInt();
        for(int i = l;i <= u; i++)
        {
            if(check(i))
            {
                System.out.println(i);
                ch = 1;
            }
        }
        if(ch == 0)
            System.out.println("No Armstrong numbers found between given range");
        sc.close();
    }
}
