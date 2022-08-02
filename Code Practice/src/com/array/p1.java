package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element no."+i+":- ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Obtained:- "+Arrays.toString(arr));
        for(int j : arr)
            System.out.println("Array elements:- "+j);
        sc.close();
    }
}
