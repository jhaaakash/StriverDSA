package com.aakash.basic.pattern;
/*

 *        *
 **      **
 ***    ***
 ****  ****
 **********
 ****  ****
 ***    ***
 **      **
 *        *


 */
public class Pattern20
{
    // Function to print pattern12
    public void pattern20(int n) {
        for(int i=0;i<n;i++)
        {   //start
            for(int j=0;j<i+1;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<2*n-2*(i+1); j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n-1;i++)
        {   //start
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print("*");
            }

            for(int j=0;j<2*i+2; j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        Pattern20 patern = new Pattern20();
        patern.pattern20(N);
    }
}
