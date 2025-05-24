package com.aakash.basic.basicString;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FrequencySort {

    public List<Character> frequencySort(String s) {
        //your code goe shere
        Map<Character,Integer> map =new HashMap<>();

        for(char c: s.toCharArray())
        {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        List<Character> chars = new ArrayList<>(map.keySet());

        chars.sort((a,b) ->
        {
            int freqCompare= Integer.compare(map.get(b), map.get(a));
            if(freqCompare==0)
            {
                return  Character.compare(a,b);
            }
            return freqCompare;
        });
        return  chars;

    }


    public static void main(String[] args) {
        FrequencySort sol = new FrequencySort();
        String s = "tree";
        List<Character> result = sol.frequencySort(s);
        System.out.println(result);
    }
}
