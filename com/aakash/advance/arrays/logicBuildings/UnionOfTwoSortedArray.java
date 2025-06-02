package com.aakash.advance.arrays.logicBuildings;

import java.util.Set;
import java.util.TreeSet;

public class UnionOfTwoSortedArray {

    public int[] unionArray(int[] nums1, int[] nums2) {

        Set<Integer> set = new TreeSet<>();

        for (int num : nums1) {

            set.add(num);
        }

        for (int num : nums2) {

            set.add(num);
        }

        int[] union = new int[set.size()];

        int index = 0;

        for (int num : set) {

            union[index++] = num;
        }

        return union;
    }

    public static void main(String[] args) {

        // Initialize the arrays
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nums2 = {2, 3, 4, 4, 5, 11, 12};

        // Create an instance of the Solution class
        UnionOfTwoSortedArray finder = new UnionOfTwoSortedArray();

        /* Get the union of nums1 and
        nums2 using the class method */
        int[] union = finder.unionArray(nums1, nums2);

        System.out.println("Union of nums1 and nums2 is:");
        for (int val : union) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
