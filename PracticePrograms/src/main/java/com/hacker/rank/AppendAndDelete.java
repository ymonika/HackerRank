package com.hacker.rank;

public class AppendAndDelete {

    //https://www.hackerrank.com/challenges/append-and-delete/problem?h_r=next-challenge&h_v=zen

    static String appendAndDelete(String iStr, String dStr, int k) {
        int steps = 0;
        String[] str1 = iStr.split("");
        String[] str2 = dStr.split("");
        if (!iStr.equals(dStr)) {
            int i = 0;
            for (; i < str2.length && i < str1.length; ) {
                if (!str1[i].equals(str2[i])) {
                    break;
                }
                i++;
            }
            steps += str1.length - i ;
            steps += str2.length - i ;
        } else {
            return "Yes";
        }
        return steps == k ? "Yes" : "No";
    }

    public static void main(String[] args) {
      System.out.println(appendAndDelete("ashley", "ash", 2)); //NO
        System.out.println(appendAndDelete("aba", "aba", 7)); //YES
        System.out.println(appendAndDelete("hackerhappy", "hackerrank", 9)); //YES
        System.out.println(appendAndDelete("XYZ", "ABC", 2)); //NO
        System.out.println(appendAndDelete("XYZ", "ABC", 6)); //YES
        System.out.println(appendAndDelete("y", "yu", 2)); //NO
        System.out.println(appendAndDelete("abcd", "abcdert", 10)); //No
    }

    /*
    ashley
    asi
     */
    //ashley
    //ash
    //2
    //NO

    /*
    aba
    aba
    7
    YES
     */

    /*
    hackerhappy
    hackerrank
    9
    YES
     */
}
