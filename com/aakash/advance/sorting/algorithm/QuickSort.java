package com.aakash.advance.sorting.algorithm;

import java.util.Random;

public class QuickSort {

    public int partition(int[] arr, int low, int high) {

        // Choosing a random index between low and high
        int randomIndex = low + new Random().nextInt(high - low + 1);
        // Swap the random element with the first element
        int temp = arr[low];
        arr[low] = arr[randomIndex];
        arr[randomIndex] = temp;

        // Now choosing arr[low] as the pivot after the swap
        int pivot = arr[low];
        // Starting index for left subarray
        int i = low;
        // Starting index for right subarray
        int j = high;

        while (i < j) {

            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            /*  Move j to the left until we find an
                element smaller than the pivot  */
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            /*  Swap elements at i and j if i is still
                less than j  */
            if (i < j) {
                int temp2 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp2;
            }
        }

        // Pivot placed in correct position
        int temp3 = arr[low];
        arr[low] = arr[j];
        arr[j] = temp3;
        return j;
    }



    public void quickSortHelper(int[] arr, int low, int high) {
        /*  Base case: If the array has one or no
            elements, it's already sorted  */
        if (low < high) {
            // Get the partition index
            int pIndex = partition(arr, low, high);
            // Sort the left subarray
            quickSortHelper(arr, low, pIndex - 1);
            // Sort the right subarray
            quickSortHelper(arr, pIndex + 1, high);
        }
    }


    public int[] quickSort(int[] nums) {
        // Get the size of array
        int n = nums.length;

        // Perform quick sort
        quickSortHelper(nums, 0, n - 1);

        // Return sorted array
        return nums;
    }



    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        int n = arr.length;

        System.out.println("Before Sorting Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Create an instance of Solution class
        QuickSort solution = new QuickSort();

        // Function call to sort the array using quick sort
        int[] sortedArr = solution.quickSort(arr);

        System.out.println("After Sorting Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(sortedArr[i] + " ");
        }
        System.out.println();
    }
}
