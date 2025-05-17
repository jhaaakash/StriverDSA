package com.aakash.basic.pattern;
/*

5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5

 */
public class Pattern22
{
    public void pattern22(int n) {
        int top,left,right, bottom, num;
        for(int i=0;i<2*n-1; i++)
        {

            for( int j=0; j< 2*n-1; j++)
            {
                top=i;
                left=j;
                bottom=(2*n-2)-i;
                right=(2*n-2)-j;
                num= n-Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(num+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        Pattern22 patern = new Pattern22();
        patern.pattern22(N);
    }
}
