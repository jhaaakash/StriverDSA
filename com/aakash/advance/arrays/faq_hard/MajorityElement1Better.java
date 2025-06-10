package com.aakash.advance.arrays.faq_hard;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement1Better {

    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums)
        {
            map.put(n, map.getOrDefault(n,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet())
        {
          if(  entry.getValue()> nums.length/2)
          {
              return entry.getKey();
          }
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {3, 3, 1, 1, 1, 3, 3};
        // Create an instance of Solution class
        MajorityElement1Better sol = new MajorityElement1Better();
        int ans = sol.majorityElement(arr);
        // Print the majority element found
        System.out.println("The majority element is: " + ans);
    }
}
