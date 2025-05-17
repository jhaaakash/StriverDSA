package com.aakash.basic.pattern;
/*

E
D E
C D E
B C D E
A B C D E

 */
public class Pattern18
{
    // Function to print pattern12
    public void pattern18(int n) {
        for(int i=0;i<n;i++)
        {
            char el= (char)('A' + n-1);

            for(char ch=(char)(el-i) ;ch<=el;ch++)
            {
                System.out.print(ch+" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        Pattern18 patern = new Pattern18();
        patern.pattern18(N);
    }
}
