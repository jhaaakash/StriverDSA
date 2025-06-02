package com.aakash.advance.arrays.logicBuildings;

public class FindMissingNumbers {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }
        return sum - total;
    }

    public static void main(String[] args) {
        // Example array with missing number
        int[] nums = {0,1, 2, 4};

        // Create an instance of the Solution class
        FindMissingNumbers solution = new FindMissingNumbers();

        /* Call the missingNumber method
        to find the missing number*/
        int ans = solution.missingNumber(nums);

        System.out.println("The missing number is: " + ans);
    }
}
