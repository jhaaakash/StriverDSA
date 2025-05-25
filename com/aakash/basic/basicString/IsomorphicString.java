package com.aakash.basic.basicString;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    public boolean isomorphicString(String s, String t) {
        Map<Character, Character> map= new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char ss= s.charAt(i);
            char tt= t.charAt(i);

            if( (map.containsKey(ss) && map.get(ss)!=tt) || (!map.containsKey(ss) && map.containsValue(tt)))
            {
                return  false;
            }
            map.put(ss,tt);
        }

        return true;
    }

    public static void main(String[] args) {
        IsomorphicString solution = new IsomorphicString();
        String s = "apple";
        String t = "bbnbm";
        if (solution.isomorphicString(s, t)) {
            System.out.println("Strings are isomorphic.");
        } else {
            System.out.println("Strings are not isomorphic.");
        }
    }
}
