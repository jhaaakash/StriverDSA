package com.aakash.basic.basicString;

import java.util.Arrays;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] str) {

        StringBuilder ans = new StringBuilder();

        Arrays.sort(str);

        String first = str[0];

        String last = str[str.length - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {

            if (first.charAt(i) != last.charAt(i)) {

                return ans.toString();
            }

            ans.append(first.charAt(i));
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String[] input = {"flower", "flow", "flight"};
        String result = solution.longestCommonPrefix(input);
        System.out.println("Longest Common Prefix: " + result); // Output: "fl"
    }
}
