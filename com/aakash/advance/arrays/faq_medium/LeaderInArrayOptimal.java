package com.aakash.advance.arrays.faq_medium;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderInArrayOptimal {
    public ArrayList<Integer> leaders(int[] nums) {

        ArrayList<Integer> alist = new ArrayList<>();

        int max = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {

            if (nums[i] > max) {

                alist.add(nums[i]);

                max = nums[i];
            }
        }

        Collections.reverse(alist);

        return alist;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 3, 1, 2};

        // Create an instance of the Solution class
        LeaderInArrayOptimal finder = new LeaderInArrayOptimal();

        // Get leaders using class method
        ArrayList<Integer> ans = finder.leaders(nums);

        System.out.print("Leaders in the array are: ");
        for (int leader : ans) {
            System.out.print(leader + " ");
        }
        System.out.println();
    }
}
