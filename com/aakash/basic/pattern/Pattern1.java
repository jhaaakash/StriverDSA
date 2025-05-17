package com.aakash.basic.pattern;

public class Pattern1
{
    public void pattern1(int n) {
    for(int i=0; i<n ; i++)
    {
        for(int j=0; j<n; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    }

    public static void main(String[] args) {
        int N = 4;
        Pattern1 patern = new Pattern1();
        patern.pattern1(N);
    }
}
