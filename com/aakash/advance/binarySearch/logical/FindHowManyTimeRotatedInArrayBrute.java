package com.aakash.advance.binarySearch.logical;

import java.util.ArrayList;
import java.util.Arrays;

public class FindHowManyTimeRotatedInArrayBrute {
    public int findKRotation(ArrayList<Integer> nums) {
        int n = nums.size();
        int ans = Integer.MAX_VALUE, index = -1;
        for (int i = 0; i < n; i++) {
            if (nums.get(i) < ans) {
                ans = nums.get(i);
                index = i;
            }
        }
        return index;
    }


    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 0, 1, 2, 3));  // Renamed arr to nums
        FindHowManyTimeRotatedInArrayBrute sol = new FindHowManyTimeRotatedInArrayBrute();
        int ans = sol.findKRotation(nums);
        System.out.println("The array is rotated " + ans + " times.");
    }
}
