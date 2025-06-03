package com.aakash.advance.arrays.faq_medium;

import java.util.ArrayList;
import java.util.List;

public class RearrangeElementbySignOptimal {

    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;

        int[] ans = new int[n];

        int positive = 0, negative = 1;

        for (int i = 0; i < n; i++) {

            if (nums[i] < 0) {

                ans[negative] = nums[i];

                negative += 2;

            } else {

                ans[positive] = nums[i];

                positive += 2;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, -4, -5};
        // Create an instance of Solution class
        RearrangeElementbySignOptimal sol = new RearrangeElementbySignOptimal();
        int[] ans = sol.rearrangeArray(A);
        // Print the result
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
