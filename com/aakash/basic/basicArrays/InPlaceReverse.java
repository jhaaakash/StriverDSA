package com.aakash.basic.basicArrays;

public class InPlaceReverse {

    public void reverse(int[] arr, int n) {
        int[]ans = new int[n];

        for(int i=n-1; i>=0;i--)
        {
            ans[n-i-1]=arr[i];
        }

        for(int i=0; i<n; i++)
        {
            arr[i]=ans[i];
        }

        return;

    }



    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {5, 4, 3, 2, 1};

        // Creating instance of Solution class
        InPlaceReverse solution = new InPlaceReverse();
        System.out.print("Original array: ");
        printArray(arr, n);

        // Function call to reverse the array
        solution.reverse(arr, n);
        System.out.print("Reversed array: ");
        printArray(arr, n);
    }


}
