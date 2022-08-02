package com.flowchart;

import java.util.*;
public class hcflcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:- ");
        System.out.print("Number 1:- ");
        int n1 = sc.nextInt();
        System.out.print("Number 2:- ");
        int n2 = sc.nextInt();
        int hcf = 1;
        for(int i=2; i <= n1 || i <= n2; i++)
        {
            if(n1 % i == 0 && n2 % i == 0)
                hcf = i;
        }
        int lcm = n1*n2/hcf;
        System.out.println("HCF & LCM of "+n1+" & "+n2+" = "+hcf+" & "+lcm+" respectively");
        sc.close();
    }
}
