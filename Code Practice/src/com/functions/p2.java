package com.functions;

import java.util.Scanner;

public class p2 {
    boolean evod(int num)
    {
        return num%2==0?true:false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int num = sc.nextInt();
        p2 p = new p2();
        System.out.println(num+" is an "+(p.evod(num)?"even":"odd")+" number");
        sc.close();;
    }
}
