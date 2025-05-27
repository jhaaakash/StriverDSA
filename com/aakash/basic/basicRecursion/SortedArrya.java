package com.aakash.basic.basicRecursion;

import java.util.ArrayList;
import java.util.List;

public class SortedArrya {
    public boolean isSorted(ArrayList<Integer> nums) {

        // your code goes here

        return sorted(nums, 0);
    }

    public boolean sorted(ArrayList<Integer> nums, int i) {

        if (i >= nums.size() - 1) {

            return true;
        }

        if (nums.get(i) > nums.get(i + 1)) {

            return false;
        }

        return sorted(nums, i + 1);
    }

    public static void main(String[] args) {

        SortedArrya solution = new SortedArrya();
        ArrayList<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        boolean result = solution.isSorted(nums);
        System.out.println(result ? "Array is sorted" : "Array is not sorted");

    }
}
