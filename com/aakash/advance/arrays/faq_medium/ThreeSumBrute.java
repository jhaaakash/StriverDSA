package com.aakash.advance.arrays.faq_medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class ThreeSumBrute {

    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> tripletSet = new HashSet<>();
    int n=nums.length;
        for(int i=0; i<n-2; i++)
        {
            for(int j=i+1; j<n-1; j++)
            {
                for(int k=j+1; k<n; k++)
                {
                    if(nums[i]+nums[j]+nums[k]==0)
                    {
                        List<Integer> temp= new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        tripletSet.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>(tripletSet);
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
