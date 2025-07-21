package com.aakash.advance.binarySearch.logical;

public class SingleNonDuplicate {
    public
    int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if (n == 1)
        {
            return nums[0];
        }
        for (int i = 0; i < n; i++)
        {
            if (i == 0)
            {
                if (nums[i] != nums[i + 1])
                {
                    return nums[i];
                }
            }
            else if (i == n - 1)
            {
                if (nums[i] != nums[i - 1])
                {
                    return nums[i];
                }
            }
            else {
                if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1])
                    return nums[i];
            }
        }
        return -1;
    }




    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4};

        // Create an object of the Solution class.
        SingleNonDuplicate sol = new SingleNonDuplicate();

        int ans = sol.singleNonDuplicate(nums);

        // Print the result.
        System.out.println("The single element is: " + ans);
    }
}
