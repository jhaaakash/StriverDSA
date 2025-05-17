package com.aakash.basic.pattern;

public class Pattern17
{
    // Function to print pattern12
    public void pattern17(int n) {

        for(int i=0 ;i <n;i++)
        {
            for( int j=0; j<n-i-1; j++)
            {
                System.out.print(" ");
            }
            char ch='A';
            for(int j=1;j<=2*i+1 ;j++)
            {
                System.out.print(ch);
                if(j<=i)
                {
                    ch++;
                }
                else{
                    ch--;
                }
            }
            for( int j=0; j<n-i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int N = 5;
        Pattern17 patern = new Pattern17();
        patern.pattern17(N);
    }
}
