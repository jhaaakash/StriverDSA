package com.aakash.advance.arrays.faq_hard;

public class MajorityElement1Brute {

    public int majorityElement(int[] nums) {

        for(int i=0; i<nums.length;i++)
        {
            int count=0;
            int element=nums[i];
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==element)
                {
                    count++;
                }
            }
            if(count>nums.length/2)
            {
                return nums[i];
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        // Create an instance of Solution class
        MajorityElement1Brute sol = new MajorityElement1Brute();
        int ans = sol.majorityElement(arr);
        // Print the majority element found
        System.out.println("The majority element is: " + ans);
    }
}
