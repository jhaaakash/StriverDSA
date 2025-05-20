package com.aakash.basic.basicArrays;

public class SumOfArrayElements {
    public  int sum(int arr[], int n) {
        int total=0;
        for(int i=0; i<n;i++)
        {
            total=total+arr[i];
        }
        return total;

    }

    public static void main(String[] args) {
        SumOfArrayElements sol = new SumOfArrayElements();
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.println("Sum of array elements: " + sol.sum(arr, n));
    }
}
