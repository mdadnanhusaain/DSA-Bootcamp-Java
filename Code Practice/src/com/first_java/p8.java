package com.first_java;

import java.util.*;
public class p8 {
    static boolean check(String name)
    {
        for(int i=0;i<name.length()/2;i++)
        {
            if(name.charAt(i) != name.charAt(name.length()-1-i))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String to check for Palindrome:- ");
        String st = sc.next();
        String res = check(st)?" is ":" is not ";
        System.out.println(st+res+"a Palindrome String");
        sc.close();
    }
}
