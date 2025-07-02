package com.aakash.advance.binarySearch.logical;

public class SearchInRotatedSortedArrayBinarySearch {

    public int search(int[] nums, int k) {
        int index=-1;
      int low=0;
      int high=nums.length-1;
      while (low<=high)
      {
          int mid= (low + high) /2;
          if(nums[mid]==k)
          {
              return mid;

          }
          if(nums[low] <= nums[mid])
          {
              if(nums[low] <= k && k< nums[mid])
              {
                  high=mid - 1;
              }
              else {
                  low=mid+1;
              }
          }
          else {
              if(nums[mid] < k && k <= nums[high])
              {
                  low=mid+1;
              }
              else {
                  high=mid - 1;
              }
          }
      }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        // Create an instance of the Solution class
        SearchInRotatedSortedArrayBinarySearch sol = new SearchInRotatedSortedArrayBinarySearch();

        // Function call to search for the target element
        int result = sol.search(nums, target);

        if (result == -1)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + result);
    }
}
