package com.aakash.basic.pattern;

public class Pattern15
{
    // Function to print pattern12
    public void pattern15(int n) {

        for (int i = 1; i <= n; i++) {

            for (char ch = 'A'; ch <= 'A' + n - i; ch++) {

                System.out.print(ch);
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {
        int N = 5;
        Pattern15 patern = new Pattern15();
        patern.pattern15(N);
    }
}
