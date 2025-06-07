package com.aakash.advance.arrays.faq_medium;

import java.util.HashSet;
import java.util.*;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
    int n=nums.length;

    Set<List<Integer>> set = new HashSet<>();

    for(int i=0;i< n;i++)
    {
        for(int j=i+1; j<n; j++)
        {
            for(int k=j+1; k<n; k++)
            {
                for(int l=k+1;l<n; l++)
                {
                    int sum= nums[i] + nums[j] + nums[k]+ nums[l];
                    if(sum==target)
                    {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }
    }
    return  new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;

        //create an instance of the Solution class
        FourSum sol = new FourSum();

        List<List<Integer>> ans = sol.fourSum(nums, target);

        // Print the result
        System.out.println("The quadruplets are: ");
        for (List<Integer> quad : ans) {
            System.out.print("[");
            for (int num : quad) {
                System.out.print(num + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
