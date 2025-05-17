package com.aakash.basic.pattern;

public class Pattern6
{
    public void pattern6(int n) {
        // Outer loop which will loop for the rows.
        for (int i = 0; i < n; i++) {

            // Inner loop which loops for the columns.
            for (int j = 0; j < n-i; j++) {
                System.out.print(j+1);
            }
            /* As soon as stars for each iteration are printed,
             move to the next row and give a line break */
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int N = 5;
        Pattern6 patern = new Pattern6();
        patern.pattern6(N);
    }
}
