package com.aakash.advance.arrays.logicBuildings;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfTwoSortedArrayOptial {

    public int[] unionArray(int[] nums1, int[] nums2) {
            int m= nums1.length;
            int n=nums2.length;
            int i=0,j=0;
            List<Integer> unionList =new ArrayList<>();

            while(i<m && j<n)
            {
                if(nums1[i]<nums2[j])
                {
                    if(unionList.isEmpty() || unionList.get(unionList.size()-1)!=nums1[i])
                    {
                        unionList.add(nums1[i]);
                    }
                    i++;
                }
                else {
                    if(unionList.isEmpty() || unionList.get(unionList.size()-1)!=nums2[j])
                    {
                        unionList.add(nums2[j]);
                    }
                    j++;
                }
            }

            while(i<m)
            {
                if(unionList.isEmpty() || unionList.get(unionList.size()-1)!=nums1[i])
                {
                    unionList.add(nums1[i]);
                }
                i++;

            }

            while(j<n)
            {
                if(unionList.isEmpty() || unionList.get(unionList.size()-1)!=nums2[j])
                {
                    unionList.add(nums2[j]);
                }
                j++;
            }

            int[] union = new int[unionList.size()];
            for(int k=0; k<unionList.size();k++)
            {
                union[k]=unionList.get(k);
            }

            return union;

    }

    public static void main(String[] args) {

        // Initialize the arrays
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nums2 = {2, 3, 4, 4, 5, 11, 12};

        // Create an instance of the Solution class
        UnionOfTwoSortedArrayOptial finder = new UnionOfTwoSortedArrayOptial();

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
