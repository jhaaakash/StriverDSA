package com.aakash.advance.arrays.faq_hard;

public class FindRepeatingAndMissing {

    public int[] findMissingRepeatingNumbers(int[] nums) {
        int repeating = -1, missing = -1;
        int n = nums.length;
        int[] freq = new int[n + 1];
        for (int num : nums) {
            freq[num]++;
        }
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                repeating = i;
            }
            if (freq[i] == 0) {
                missing = i;
            }
        }
        return new int[] {repeating, missing};
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 4, 6, 7, 5};

        // Create an instance of Solution class
        FindRepeatingAndMissing sol = new FindRepeatingAndMissing();

        int[] result = sol.findMissingRepeatingNumbers(nums);

        // Print the repeating and missing numbers found
        System.out.println("The repeating and missing numbers are: {" + result[0] + ", " + result[1] + "}");
    }
}
