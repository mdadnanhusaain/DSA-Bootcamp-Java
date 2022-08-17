package com.first_java;

import java.util.*;
public class p1 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> n1 = new ArrayList<Integer>();
        ArrayList<Integer> n2 = new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j] && !n1.contains(i) && !n2.contains(j))
                {
                    arr.add(nums2[j]);
                    n1.add(i);
                    n2.add(j);
                }
            }
        }
        int[] res = new int[arr.size()];
        for(int ele : arr)
            res[arr.indexOf(ele)] = ele;
        for(int ele : res)
            System.out.print(ele+" ");
    }
}