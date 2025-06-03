package com.aakash.advance.arrays.faq_medium;

import java.util.ArrayList;

public class LeaderInArrayBrute {
    public ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> alist = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            boolean leader = true;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader) {
                alist.add(nums[i]);
            }
        }
        return alist;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 3, 1, 2};

        // Create an instance of the Solution class
        LeaderInArrayBrute finder = new LeaderInArrayBrute();

        // Get leaders using class method
        ArrayList<Integer> ans = finder.leaders(nums);

        System.out.print("Leaders in the array are: ");
        for (int leader : ans) {
            System.out.print(leader + " ");
        }
        System.out.println();
    }
}
