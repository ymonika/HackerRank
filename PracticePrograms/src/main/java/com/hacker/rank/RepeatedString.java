package com.hacker.rank;

public class RepeatedString {

    static long repeatedString(String str, long n) {
        int strLength = str.length();

        long occurrenceInStr = getCountOfA(str, strLength);
        long d = n / strLength;
        long r =  (n - (strLength * d));
        long total = d * occurrenceInStr;
        long occurrenceInRemainingStr = getCountOfA(str, r);
        return total + occurrenceInRemainingStr;
    }

    private static long getCountOfA(String str, long strSizeLimit) {
        String a = "a";
        long occurrenceInRemainingStr = 0;
        String[] s = str.split("");
        for (int i = 0; i < strSizeLimit; i++) {
            if (s[i].equals(a)) {
                occurrenceInRemainingStr++;
            }
        }
        return occurrenceInRemainingStr;
    }

    public static void main(String[] args) {
        //aba 10 7
        //abcac 10 4
        //a 100000 100000

        /*repeatedString("aba", 10);
        repeatedString("abcac", 10);*/
        repeatedString("a", 1000000000000l);
    }
}
