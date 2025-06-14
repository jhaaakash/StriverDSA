package com.aakash.advance.arrays.faq_hard;

public class NumberOfInversions {

    public long numberOfInversions(int[] nums) {
        // Size of the array
        int n = nums.length;
        // Count the number of pairs
        long cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                /* If nums[i] is greater than
                nums[j], increase count by 1*/
                if (nums[i] > nums[j]) {
                    cnt++;
                }
            }
        }
        // Return the count of inversions
        return cnt;
    }

    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};

        // Create an instance of Solution class
        NumberOfInversions sol = new NumberOfInversions();

        long result = sol.numberOfInversions(nums);

        // Print the number of inversions found
        System.out.println("The number of inversions is: " + result);
    }
}
