package com.aakash.basic.basicArrays;

public class CheckIfArrayIsSortedInAsc {
    boolean arraySortedOrNot(int[] arr, int n) {
        for(int i=1; i<n;i++)
        {
            if(arr[i]<arr[i-1])
            {
                return false;
            }
        }
return  true;
    }

    public static void main(String[] args) {
        // Creating an instance of solution class
        CheckIfArrayIsSortedInAsc solution = new CheckIfArrayIsSortedInAsc();

        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        // Function call to check if the array is sorted
        boolean sorted = solution.arraySortedOrNot(arr, n);

        if (sorted) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }
}
