package com.aakash.basic.basicString;

public class RotateString {
    public boolean rotateString(String s, String goal) {
         int n = s.length();
        if (s.length() != goal.length()) {
            return false;
        }

        for (int i = 0; i < n; i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if (rotated.equals(goal)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        RotateString sol = new RotateString();
        System.out.println(sol.rotateString("abcde", "cdeab"));
        System.out.println(sol.rotateString("abcde", "abced"));
    }
}
