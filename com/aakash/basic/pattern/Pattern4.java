package com.aakash.basic.pattern;

public class Pattern4
{
    public void pattern4(int n) {
        for (int i = 1; i <=n; i++) {

            // Inner loop which loops for the columns.
            for (int j = 1; j <=i; j++) {
                System.out.print(i);
            }
            /* As soon as stars for each iteration are printed,
             move to the next row and give a line break */
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int N = 5;
        Pattern4 patern = new Pattern4();
        patern.pattern4(N);
    }
}
