package com.aakash.advance.arrays.faq_medium;

import java.util.*;

public class ThreeSumBetter{
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> tripleSet = new HashSet<>();
        int n= nums.length;

        for(int i=0; i< n; i++)
        {
            Set<Integer> hashset = new HashSet<>();

            for(int j=i+1; j<n; j++)
            {
                int third= -(nums[i]+ nums[j]);

                if(hashset.contains(third))
                {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);

                    Collections.sort(temp);
                    tripleSet.add(temp);
                }
                hashset.add(nums[j]);
            }
        }
        List<List<Integer>> ans= new ArrayList<>(tripleSet);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        // Create an instance of Solution class
        ThreeSumBrute sol = new ThreeSumBrute();
        List<List<Integer>> ans = sol.threeSum(nums);
        // Print the result
        for (List<Integer> triplet : ans) {
            System.out.print("[");
            for (int num : triplet) {
                System.out.print(num + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}


