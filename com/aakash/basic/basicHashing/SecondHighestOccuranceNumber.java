package com.aakash.basic.basicHashing;

public class SecondHighestOccuranceNumber {

    public int secondMostFrequentElement(int[] input)
    {
        int n = input.length;
        int maxFreq = 0;
        int secMaxFreq = 0;

        int maxEle = -1, secEle = -1;

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            int freq = 0;

            for (int j = i; j < n; j++) {
                if (input[i] == input[j]) {
                    freq++;
                    visited[j] = true;
                }
            }

            if (freq > maxFreq) {
                secMaxFreq = maxFreq;
                maxFreq = freq;
                secEle = maxEle;
                maxEle = input[i];
            } else if (freq == maxFreq) {
                maxEle = Math.min(maxEle, input[i]);
            } else if (freq > secMaxFreq) {
                secMaxFreq = freq;
                secEle = input[i];
            } else if (freq == secMaxFreq) {
                secEle = Math.min(secEle, input[i]);
            }
        }

        return secEle;
    }




    public static void main(String[] args) {
        int[] nums = {4, 4, 5, 5, 6, 7};

        /* Creating an instance of
        Solution class */
        SecondHighestOccuranceNumber sol = new SecondHighestOccuranceNumber();

        /* Function call to get the second
        highest occurring element in array */
        int ans = sol.secondMostFrequentElement(nums);

        System.out.println("The second highest occurring element in the array is: " + ans);


    }
}
