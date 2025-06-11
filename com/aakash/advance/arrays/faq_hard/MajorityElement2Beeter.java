package com.aakash.advance.arrays.faq_hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2Beeter {

    public List<Integer> majorityElementTwo(int[] nums) {

        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int mini = nums.length/3+1;
        for(int i=0; i<nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i]) ==mini){
                result.add(nums[i]);
            }
            if(result.size()==2)
            {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {11, 33, 33, 11, 33, 11};

        // Create an instance of Solution class
        MajorityElement2Beeter sol = new MajorityElement2Beeter();

        List<Integer> ans = sol.majorityElementTwo(arr);

        // Print the majority elements found
        System.out.print("The majority elements are: ");
        for (int it : ans) {
            System.out.print(it + " ");
        }
        System.out.println();
    }
}
