package com.hacker.rank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindDigits {

    //https://www.hackerrank.com/challenges/find-digits/problem

    static int findDigits(int n) {
        int temp = n;
        List<Integer> numberDigits = new ArrayList<>();
        while (temp > 0) {
            numberDigits.add(temp%10);
            temp = temp/10;

        }
        numberDigits = numberDigits.stream().filter( digit -> digit != 0 && ((n%digit) == 0)).collect(Collectors.toList());
        return numberDigits.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        findDigits(11111);
        //System.out.println((Integer.MAX_VALUE+"").length());
        /*int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(findDigits(scanner.nextInt()));
        }*/

    }
}
