package com.aakash.advance.arrays.logicBuildings;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOf2Array {

    public int[] intersectionArrays(int[] nums1, int[] nums2) {

        List<Integer> tempList = new ArrayList<>();

        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {

                i++;

            } else if (nums1[i] > nums2[j]) {

                j++;

            } else {

                tempList.add(nums1[i]);

                i++;

                j++;
            }
        }

        int[] ans = new int[tempList.size()];

        for (int k = 0; k < tempList.size(); k++) {

            ans[k] = tempList.get(k);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3, 4, 5, 6, 7};
        int[] nums2 = {3, 3, 4, 4, 5, 8};

        // Create an instance of the Solution class
        IntersectionOf2Array finder = new IntersectionOf2Array();

        int[] ans = finder.intersectionArrays(nums1, nums2);

        //Print the intersection of both arrays
        System.out.println("Intersection of nums1 and nums2 is:");
        for (int val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
