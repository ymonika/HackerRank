package com.hacker.rank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/strange-advertising/problem

public class ViralAdvertising {

    public static void main(String[] args) {
        int totalStartNumber = 5;
        Scanner scanner = new Scanner(System.in);
        int tillWhatNumber = scanner.nextInt();
        List<Integer> numberOfLinkes = new ArrayList<>(tillWhatNumber);
        for(int startIndex = 1; startIndex <= tillWhatNumber; startIndex++) {
            totalStartNumber = totalStartNumber/2;
            numberOfLinkes.add(totalStartNumber);
            totalStartNumber *= 3;
        }
        System.out.println(numberOfLinkes.stream().mapToInt(Integer::intValue).sum());
    }
}
