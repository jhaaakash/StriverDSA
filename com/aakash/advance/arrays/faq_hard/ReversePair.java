package com.aakash.advance.arrays.faq_hard;

public class ReversePair {

    public int reversePairs(int[] nums) {

        int count = 0;

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (nums[i] > 2 * nums[j]) {

                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {

        int[] nums = {6, 4, 1, 2, 7};

        // Create an instance of the Solution class
        ReversePair sol = new ReversePair();

        int cnt = sol.reversePairs(nums);

        // Output the result
        System.out.println("The number of reverse pairs is: " + cnt);
    }
}
