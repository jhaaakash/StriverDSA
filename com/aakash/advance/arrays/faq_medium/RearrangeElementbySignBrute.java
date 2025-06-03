package com.aakash.advance.arrays.faq_medium;

import java.util.*;
public class RearrangeElementbySignBrute {

    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;

        List<Integer> pos = new ArrayList<>();

        List<Integer> neg = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (nums[i] > 0) pos.add(nums[i]);
            else neg.add(nums[i]);
        }

        for (int i = 0; i < n / 2; i++) {

            nums[2 * i] = pos.get(i);

            nums[2 * i + 1] = neg.get(i);
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, -4, -5};
        // Create an instance of Solution class
        RearrangeElementbySignBrute sol = new RearrangeElementbySignBrute();
        int[] ans = sol.rearrangeArray(A);
        // Print the result
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
