package com.aakash.basic.basicHashing;

import  java.util.*;

public class SecondHighestOccuranceNumberWithMap {


    private int secondMostFrequentElement(int[] nums) {

        int highest=-1;
        int secondHighest=-1;
        int maxFreq=0;
        int secHighFreq=0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i< nums.length;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> it : map.entrySet())
        {
            int ele=it.getKey();
            int freq=it.getValue();
            if(freq>maxFreq)
            {
                secondHighest=highest;
                secHighFreq=maxFreq;
                highest=ele;
                maxFreq=freq;
            }
            else if(freq==maxFreq)
            {
                highest=Math.min(ele, highest);
            } else if (freq>secHighFreq)
            {
                secHighFreq=freq;
                secondHighest=ele;

            } else if (freq==secHighFreq)
            {
             secondHighest= Math.min(ele, secondHighest);
            }

        }
    return secondHighest;
    }

    public static void main(String[] args) {

        int[] nums = {4, 4, 5, 5, 6, 7};

        /* Creating an instance of
        Solution class */
        SecondHighestOccuranceNumberWithMap sol = new SecondHighestOccuranceNumberWithMap();

        /* Function call to get the second
        highest occurring element in array */
        int ans = sol.secondMostFrequentElement(nums);

        System.out.println("The second highest occurring element in the array is with map approach is: " + ans);


    }


}
