package com.aakash.basic.basicHashing;

import java.util.HashMap;
import java.util.Map;

public class SumOfHighestAndSecondHighestFreq {


    public int sumHighestAndLowestFrequency(int[] nums) {

        Map<Integer, Integer> map =new HashMap<>();

        for(int i=0;i< nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        int min=nums.length;

        for(Map.Entry<Integer, Integer> it: map.entrySet())
        {
            int freq=it.getValue();

            max=Math.max(freq, max);
            min= Math.min(freq,min);

        }
        System.out.println(max);
        System.out.println(min);

        return  max+min;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3};

        /* Creating an instance of
        Solution class */
        SumOfHighestAndSecondHighestFreq sol = new SumOfHighestAndSecondHighestFreq();

        /* Function call to get the sum of highest
        and lowest frequency in array */
        int ans = sol.sumHighestAndLowestFrequency(nums);

        System.out.println("The sum of highest and lowest frequency in the array is: " + ans);
    }
}
