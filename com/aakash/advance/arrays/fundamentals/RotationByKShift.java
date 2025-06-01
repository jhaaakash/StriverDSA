package com.aakash.advance.arrays.fundamentals;

public class RotationByKShift {
    public void reverseArray(int[] nums, int low, int high) {

        while (low < high) {

            int temp = nums[low];

            nums[low] = nums[high];

            nums[high] = temp;

            low++;

            high--;
        }
    }

    public void rotateArray(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        reverseArray(nums, 0, k - 1);

        reverseArray(nums, k, n - 1);

        reverseArray(nums, 0, n - 1);
    }


    public static void printArray(int[] nums) {
        for (int val : nums) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 2;

        System.out.println("Initial array: ");
        printArray(nums);

        // Create an instance of the Solution class
        RotationByKShift sol = new RotationByKShift();

        /* Function call to rotate the
        array to the left by k places */
        sol.rotateArray(nums, k);

        System.out.println("Array after rotating elements by " + k + " places: ");
        printArray(nums);
    }
}
