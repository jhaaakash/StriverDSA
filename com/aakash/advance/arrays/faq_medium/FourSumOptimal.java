package com.aakash.advance.arrays.faq_medium;

import java.util.*;

public class FourSumOptimal {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> ans= new ArrayList<>();
        int n= nums.length;

        Arrays.sort(nums);
        for(int i=0; i<n; i++)
        {
            if( i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            for(int j=i+1; j<n; j++)
            {
                if(j>i+1 && nums[j]== nums[j-1])
                {
                    continue;
                }

                int k=j+i;
                int l=n-1;

                while(k<l)
                {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                     if(sum==target)
                     {
                         List<Integer> temp= Arrays.asList( nums[i], nums[j], nums[k], nums[l]);
                         ans.add(temp);
                         k++;
                         l--;
                         while (k < l && nums[k] == nums[k - 1]) k++;
                         while (k < l && nums[l] == nums[l + 1]) l--;
                     } else if (sum <target) {
                         k++;
                     }
                     else {
                         l--;
                     }
                }
            }

        }
    return  ans;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;

        //create an instance of the Solution class
        FourSumOptimal sol = new FourSumOptimal();

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
