package com.aakash.advance.arrays.fundamentals;

public class LeftRotationofArray {
    public void rotateArrayByOne(int[] nums) {
        int temp=nums[0];
        for(int i=0; i< nums.length-1; i++)
        {
            nums[i]=nums[i+1];
            if(i==nums.length -1)
            {
                nums[i]=temp;
            }
        }
        nums[nums.length-1]=temp;
    }

    public static void main(String[] args) {
        LeftRotationofArray solution = new LeftRotationofArray();
        int[] nums = {1, 2, 3, 4, 5};

        solution.rotateArrayByOne(nums);

        // Output the rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }


}
