package com.aakash.basic.basicMath;

public class ArmStrongNumber {


    public boolean isArmstrong(int n) {

        int sum = 0;

        int count = (int) Math.log10(n) + 1;

        int original = n;

        int num;

        while (n > 0) {

            num = n % 10;

            sum = (int) (sum + Math.pow(num, count));

            n = n / 10;
        }

        return original == sum;
    }


    public static void main(String[] args) {
        int n = 153;

        /* Creating an instance of
        Solution class */
        ArmStrongNumber sol = new ArmStrongNumber();

        /* Function call to find whether the
        given number is Armstrong or not */
        boolean ans = sol.isArmstrong(n);

        if (ans) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
