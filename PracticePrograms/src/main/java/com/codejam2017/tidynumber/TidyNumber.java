package com.codejam2017.tidynumber;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class TidyNumber {

    public static String findLastTidyNumber(int number) {
        int previousNum = number;
        while (previousNum > 0) {
            String[] previousNumSorted = ("" + previousNum).split("");
            Arrays.sort(previousNumSorted);
            int newNum = Integer.parseInt(String.join("", previousNumSorted));
            if (Math.abs(previousNum-newNum) == 0) {
                return newNum + "";
            }
            previousNum -= 1;
        }
        return "";
    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new BufferedReader(new FileReader("/home/ee/personal/JavaProgrammingExamples/PracticePrograms/src/main/java/com/codejam2017/tidynumber/B-large-practice.in")));
        int n = in.nextInt();
        System.out.println("723897627649600590".length() +"\n"+ "9223372036854775807".length());
        for (int i = 1; i <= n; ++i) {
            int m = in.nextInt();
            System.out.println("Case #" + i + ": " + findLastTidyNumber(m));
        }
    }
}
