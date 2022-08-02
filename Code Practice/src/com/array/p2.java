package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class p2 {
    public static void main(String[] args) {
        int[] num = {2,1,5};
        int k = 806;
        ArrayList<Integer> res = new ArrayList<Integer>();
        int sum,c=k;
        for(int i=num.length-1;i>=0;i--)
        {
            sum = num[i] + c;
            res.add(sum%10);
            c = (int)sum/10;
        }
        Collections.reverse(res);
        if(c!=0)
            res.add(0,c);
        System.out.println(res);
    }
    
}
