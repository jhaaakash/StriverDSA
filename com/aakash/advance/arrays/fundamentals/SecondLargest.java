package com.aakash.advance.arrays.fundamentals;

public class SecondLargest {
    public int secondLargestElement(int[] nums) {
        int max=nums[0];
        int secondLargest=-1;
        for(int i=0; i< nums.length; i++)
        {
            if(nums[i]> max)
            {
                secondLargest=max;
                max= nums[i];
            }
            else if(nums[i]<max && nums[i]>secondLargest)
            {
                secondLargest=nums[i];
            }
        }
        return secondLargest;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 7, 5};

        // Create an instance of the Solution class
        SecondLargest sol = new SecondLargest();

        /* Call the method to find
        the second largest element */
        int ans = sol.secondLargestElement(nums);

        System.out.println("The second largest element is: " + ans);
    }

}
