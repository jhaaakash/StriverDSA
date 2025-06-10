package com.aakash.advance.arrays.faq_hard;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement1Optimal {

    public int majorityElement(int[] nums) {

        int n= nums.length;
        int count=0;
        int ele=0;
        for(int i=0; i<n; i++)
        {
           if(count==0)
           {
               count=1;
               ele=nums[i];
           } else if (ele == nums[i]) {
               count++;
           } else {
               count--;
           }
        }

        int count1=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == ele)
            {
                count1++;
            }
        }

        if(count1>nums.length/2)
        {
            return ele;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {5, 5, 1, 1, 1, 5, 5};
        // Create an instance of Solution class
        MajorityElement1Better sol = new MajorityElement1Better();
        int ans = sol.majorityElement(arr);
        // Print the majority element found
        System.out.println("The majority element is: " + ans);
    }
}
