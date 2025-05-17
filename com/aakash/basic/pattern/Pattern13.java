package com.aakash.basic.pattern;

public class Pattern13
{
    // Function to print pattern12

    public void pattern13(int n) {

        int num = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(num + " ");

                num++;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        Pattern13 patern = new Pattern13();
        patern.pattern13(N);
    }
}
