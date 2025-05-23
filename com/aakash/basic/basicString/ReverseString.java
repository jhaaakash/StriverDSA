package com.aakash.basic.basicString;

import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

public class ReverseString {
    public  void reverseString(Vector<Character> s)
    {
        Stack<Character> stack = new Stack<>();

        for(char c:s)
        {
            stack.push(c);
        }
        for(int i=0; i<s.size(); i++)
        {
           s.set(i, stack.pop());
        }

        return;
    }

    public static void main(String[] args) {
        Vector<Character> str =new Vector<>(Arrays.asList('h','e','l','l','o'));
        ReverseString sol= new ReverseString();
        sol.reverseString(str);
        for(char c: str)
        {
            System.out.print(c);
        }

    }
}
