package com.aakash.basic.basicRecursion;

import java.util.Vector;

public class ReverseAStringI {

    public Vector<Character> reverseString(Vector<Character> s) {

        int left=0;
        int right= s.size()-1;
        reverse(s, left, right);
        return s;
    }

    public void reverse(Vector<Character> s, int left, int right)
    {
        if(left>=right)
        {
            return ;
        }

        char temp = s.get(left);
        s.set(left, s.get(right));
        s.set(right, temp);

        reverse(s,left+1, right-1);
    }


    public static void main(String[] args) {
        ReverseAStringI solution = new ReverseAStringI();
        Vector<Character> s = new Vector<>();
        s.add('h');
        s.add('e');
        s.add('l');
        s.add('l');
        s.add('o');

        // Function call to reverse the given string
        Vector<Character> reversed = solution.reverseString(s);
        System.out.println(reversed);
    }

}
