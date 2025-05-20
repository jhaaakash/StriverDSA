package com.aakash.basic.basicMath;

public class LCM {

    public int lcm(int n1, int n2) {

        int start = Math.max(n1,n2);
        int Smallest=1;

        for(int i=start; i<=n1*n2; i++)
        {
            if(i%n1==0 && i%n2==0)
            {
                Smallest=i;
                break;
            }
        }
        return Smallest;

    }

    public static void main(String[] args) {
        int n1 = 4, n2 = 12;

        /* Creating an instance of
        Solution class */
        LCM sol = new LCM();

        // Function call to get LCM of n1 and n2
        int ans = sol.lcm(n1, n2);
        System.out.println("The LCM of " + n1 + " and " + n2 + " is: " + ans);
    }
}
