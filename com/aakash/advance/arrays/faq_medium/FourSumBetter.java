package com.aakash.advance.arrays.faq_medium;

import java.util.*;

public class FourSumBetter {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        // Set to store unique quadruplets
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0; i< n; i++)
        {
            for(int j=i+1; j<n; j++ )
            {
                Set<Integer> hashset= new HashSet<>();

                for(int k=j+1; k<n; k++)
                {
                    int sum= nums[i]+ nums[j]+nums[k];
                    int fourth=target-sum;

                    if(hashset.contains(fourth))
                    {
                        List<Integer> temp= Arrays.asList(nums[i], nums[j], nums[k], fourth);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                    hashset.add(nums[k]);
                }
            }
        }

    ans.addAll(set);
    return  ans;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;

        //create an instance of the Solution class
        FourSumBetter sol = new FourSumBetter();

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
