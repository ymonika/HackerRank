package com.programming.examples;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubStringCount {

    /*
    1 1: The only substring of a is itself, so we print  on a new line.
1 4: The substrings of abaa are a, b, ab, ba, aa, aba, baa, and abaa, so we print  on a new line.
1 1: The only substring of a is itself, so we print  on a new line.
1 4: The substrings of abaa are a, b, ab, ba, aa, aba, baa, and abaa, so we print  on a new line.
0 2: The substrings of aab are a, b, aa, ab, and aab, so we print  on a new line.
     */

    public static int getAllCombinations(String str) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                set.add(str.substring(i, j));
            }
        }
        return set.size();
    }

    static int[] countSubStrings(String s, int[][] queries) {
        int n = queries.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = getAllCombinations(s.substring(queries[i][0],queries[i][1]+1));
        }
        return result;
    }


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String[] nq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nq[0].trim());

        int q = Integer.parseInt(nq[1].trim());

        String s = scanner.nextLine();

        int[][] queries = new int[q][2];

        for (int queriesRowItr = 0; queriesRowItr < q; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 2; queriesColumnItr++) {
                int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr].trim());
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        int[] result = countSubStrings(s, queries);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            System.out.println(result[resultItr]);
            if (resultItr != result.length - 1) {

            }
        }

    }
}
