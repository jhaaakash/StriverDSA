package com.aakash.basic.pattern;

public class Pattern3
{
    public void pattern3(int n) {
        for (int i = 1; i <=n; i++) {

            // Inner loop which loops for the columns.
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            /* As soon as stars for each iteration are printed,
             move to the next row and give a line break */
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int N = 5;
        Pattern3 patern = new Pattern3();
        patern.pattern3(N);
    }
}
