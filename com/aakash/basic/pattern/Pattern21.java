package com.aakash.basic.pattern;
/*

 *****
 *   *
 *   *
 *   *
 *****


 */
public class Pattern21
{
    // Function to print pattern12
    public void pattern21(int n) {
        for(int i=1; i<=n;i++)
        {
            if(i==1 || i==n)
        {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");

            }
        }

            else
            {
                for(int j=1;j<=n; j++)
                {
                    if(j==1 || j==n)
                    {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }


            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int N = 5;
        Pattern21 patern = new Pattern21();
        patern.pattern21(N);
    }
}
