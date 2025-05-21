package com.aakash.basic.basicHashing;

import  java.util.*;

public class MostFrequentElement {

    public int mostFrequentElement(int[] nums) {

        int n= nums.length;
        int maxFreq=0;
        int maxEle=0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<n; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0) +1);
        }

        for(Map.Entry<Integer, Integer> it : map.entrySet())
        {
            int ele = it.getKey();
            int freq= it.getValue();

            if(freq > maxFreq)
            {
                maxFreq=freq;
                maxEle =ele;
            }
            else if(freq==maxFreq)
            {
                maxEle= Math.min(maxEle, ele);
            }

        }
        return maxEle;
    }


    public static void main(String[] args) {
        int[] nums = {4, 4, 5, 5, 6};

        /* Creating an instance of
        Solution class */
        MostFrequentElement sol = new MostFrequentElement();

        /* Function call to get the
        highest occurring element in array n */
        int ans = sol.mostFrequentElement(nums);

        System.out.println("The highest occurring element in the array is: " + ans);
    }
}
