package com.aakash.basic.basicHashing;

public class SecondHighestOccuranceNumber {

    public int secondMostFrequentElement(int[] input)
    {
        return  1;
    }




    public static void main(String[] args) {
        int[] nums = {4, 4, 5, 5, 6, 7};

        /* Creating an instance of
        Solution class */
        SecondHighestOccuranceNumber sol = new SecondHighestOccuranceNumber();

        /* Function call to get the second
        highest occurring element in array */
        int ans = sol.secondMostFrequentElement(nums);

        System.out.println("The second highest occurring element in the array is: " + ans);


    }
}
