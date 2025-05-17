package com.aakash.basic.pattern;

public class Pattern2
{
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

    public static void main(String[] args) {
        int N = 5;
        Pattern2 patern = new Pattern2();
        patern.pattern2(N);
    }
}
