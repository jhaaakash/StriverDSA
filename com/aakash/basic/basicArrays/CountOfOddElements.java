package com.aakash.basic.basicArrays;

public class CountOfOddElements {

    public int countOdd(int[] arr, int n) {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                count++;
            }

        }
        return count;
    }
    public static void main(String[] args) {

        // Creating an instance of Solution class
        CountOfOddElements sol = new CountOfOddElements();
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        // Function call to count the odd numbers in an array
        int count = sol.countOdd(arr, n);
        System.out.println("Count of odd numbers: " + count);
    }
}
