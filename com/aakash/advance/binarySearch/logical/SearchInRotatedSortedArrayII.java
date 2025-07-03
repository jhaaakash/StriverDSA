package com.aakash.advance.binarySearch.logical;

public class SearchInRotatedSortedArrayII {

    public boolean searchInARotatedSortedArrayII(int[] arr, int target) {
        int n = arr.length;

        // Traverse the array to find the target element
        for (int i = 0; i < n; i++) {
            // If the current element matches the target, return true
            if (arr[i] == target) return true;
        }
        // If the target is not found, return false
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int target = 3;

        // Create an instance of the Solution class
        SearchInRotatedSortedArrayII sol = new SearchInRotatedSortedArrayII();

        // Function call to search for the target element
        boolean result = sol.searchInARotatedSortedArrayII(arr, target);

        if (!result)
            System.out.println("Target is not present.");
        else
            System.out.println("Target is present in the array.");
    }
}
