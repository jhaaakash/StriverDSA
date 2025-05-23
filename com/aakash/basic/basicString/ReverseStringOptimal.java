package com.aakash.basic.basicString;

import java.util.Arrays;
import java.util.Vector;

public class ReverseStringOptimal {
    public  void reverseString(Vector<Character> s)
    {
        int start=0;
        int end=s.size()-1;

        while (start<end)
        {
            char ch= s.get(start);
            s.set(start,s.get(end));
            s.set(end, ch);
            start++;
            end--;
        }
        return;
    }


    public static void main(String[] args) {
        Vector<Character> str =new Vector<>(Arrays.asList('A','A','K','A','S','H'));
        ReverseString sol= new ReverseString();
        sol.reverseString(str);
        for(char c: str)
        {
            System.out.print(c);
        }

    }
}
