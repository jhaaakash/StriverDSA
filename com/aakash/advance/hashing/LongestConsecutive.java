package com.aakash.advance.hashing;

import java.sql.SQLOutput;

public class LongestConsecutive {

    private boolean linearSearch(int[] a, int num)
    {
        int n=a.length;
        for(int i=0; i< n; i++)
        {
            if(a[i] == num)
            {
                return true;
            }
        }
        return false;
    }
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int longest = 1;

        for(int i = 0; i< n; i++)
        {
            int x=nums[i];
            int cnt=1;

            while(linearSearch(nums, x+1) ==true)
            {
                x += 1;
                cnt +=1;
            }
            longest= Math.max(longest,cnt);

        }
        return longest;
    }

    public static void main(String[] args) {
        int[] a = {100, 4, 200, 1, 3, 2};

        // Create an instance of the Solution class
        LongestConsecutive solution = new LongestConsecutive();

        // Function call for longest consecutive sequence
        int ans = solution.longestConsecutive(a);
        System.out.println("The longest consecutive sequence is " + ans);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
