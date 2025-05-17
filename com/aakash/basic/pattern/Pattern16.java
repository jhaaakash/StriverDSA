package com.aakash.basic.pattern;

public class Pattern16
{
    // Function to print pattern12
    public void pattern16(int n) {

        char ch = 'A';

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(ch);
            }

            ch++;

            System.out.println();
        }
    }


    public static void main(String[] args) {
        int N = 5;
        Pattern16 patern = new Pattern16();
        patern.pattern16(N);
    }
}
