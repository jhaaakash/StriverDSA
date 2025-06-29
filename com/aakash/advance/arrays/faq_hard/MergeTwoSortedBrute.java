package com.aakash.advance.arrays.faq_hard;

public class MergeTwoSortedBrute {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m + n];
        int left = 0;
        int right = 0;
        int index = 0;
        while (left < m && right < n) {
            if (nums1[left] <= nums2[right]) {
                merged[index++] = nums1[left++];
            } else {
                merged[index++] = nums2[right++];
            }
        }
        while (left < m) {
            merged[index++] = nums1[left++];
        }
        while (right < n) {
            merged[index++] = nums2[right++];
        }

        for (int i = 0; i < m + n; i++) {
            nums1[i] = merged[i];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {-5, -2, 4, 5, 0, 0, 0};
        int[] nums2 = {-3, 1, 8};
        int m = 4, n = 3;
        // Create an instance of the Solution class
        MergeTwoSortedBrute sol = new MergeTwoSortedBrute();
        // Merge nums1 and nums2
        sol.merge(nums1, m, nums2, n);
        // Output the merged arrays
        System.out.println("The merged arrays is:");
        System.out.print("nums1[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}
