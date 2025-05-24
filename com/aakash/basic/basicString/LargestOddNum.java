package com.aakash.basic.basicString;

public class LargestOddNum {

    public String largeOddNum(String s) {
        int n=s.length();
        int indx=-1;

        for(int i=n-1; i>=0; i--)
        {
            if((s.charAt(i)-'0')%2==1)
            {
                indx=i;
                break;
            }
        }

        if(indx==-1)
        {
            return "";
        }

       int i=0;
        while (s.charAt(i)=='0')
        {
            i++;
        }


        return s.substring(i, indx+1);
    }

    public static void main(String[] args) {
        LargestOddNum solution = new LargestOddNum();
        String num = "504";
        String result = solution.largeOddNum(num);
        System.out.println("Largest odd number: " + result);
    }
}
