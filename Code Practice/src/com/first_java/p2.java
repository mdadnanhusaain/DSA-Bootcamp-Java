package com.first_java;

import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hey User! Please enter your name:- ");
        System.out.println("Hey "+sc.nextLine()+"! We're too glad to have you onboard");
        sc.close();
    }
}