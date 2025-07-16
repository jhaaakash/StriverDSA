package com.aakash.advance.binarySearch.logical;

import java.util.ArrayList;
import java.util.Arrays;

public class FinfMinimumInRotatedSortedArrayBrute {

    public int findMin(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            if (arr.get(i + 1) < arr.get(i)) {
                return arr.get(i + 1);
            }
        }
        return arr.get(0);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 0, 1, 2, 3));

        // Create an object of the Solution class
        FinfMinimumInRotatedSortedArrayBrute sol = new FinfMinimumInRotatedSortedArrayBrute();

        int ans = sol.findMin(arr);

        // Print the result
        System.out.println("The minimum element is: " + ans);
    }
}
