package com.aakash.basic.pattern;

public class Pattern5
{
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
        Pattern5 patern = new Pattern5();
        patern.pattern5(N);
    }
}
