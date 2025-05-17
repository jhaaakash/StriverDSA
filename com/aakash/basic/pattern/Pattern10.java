package com.aakash.basic.pattern;

public class Pattern10
{
    public void pattern10(int n) {

        pattern2(n);
        pattern5(n-1);


    }

    public void pattern2(int n) {
        for (int i = 0; i < n; i++) {

            // Inner loop which loops for the columns.
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            /* As soon as stars for each iteration are printed,
             move to the next row and give a line break */
            System.out.println();
        }

    }

    public void pattern5(int n) {
        // Outer loop which will loop for the rows.
        for (int i = 0; i < n; i++) {

            // Inner loop which loops for the columns.
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            /* As soon as stars for each iteration are printed,
             move to the next row and give a line break */
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        Pattern10 patern = new Pattern10();
        patern.pattern10(N);
    }
}
