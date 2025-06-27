package com.aakash.advance.binarySearch.logical;

public class GetFloorAndCeil {

    public int[] getFloorAndCeil(int[] nums, int x) {
        int floor = -1, ceil = -1;
        for (int num : nums) {
            if (num <= x && num > floor) floor = num;
            if (num >= x && (ceil == -1 || num < ceil)) ceil = num;
        }
        return new int[]{floor, ceil};
    }
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10, 12, 14};
        int x = 1;
        GetFloorAndCeil sol = new GetFloorAndCeil();
        int[] res = sol.getFloorAndCeil(nums, x);
        System.out.println(res[0] + " " + res[1]);
    }
}
