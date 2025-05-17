package com.aakash.basic.pattern;

public class Pattern14
{
    // Function to print pattern12
    public void pattern14(int n) {

        for (int i = 0; i < n; i++) {


            for (char ch = 'A'; ch <= 'A' + i; ch++) {

                System.out.print(ch);
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {
        int N = 5;
        Pattern14 patern = new Pattern14();
        patern.pattern14(N);
    }
}
