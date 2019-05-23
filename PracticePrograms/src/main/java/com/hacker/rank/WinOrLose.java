package com.hacker.rank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WinOrLose {

    public static String winOrlose(int[] v, int[] p) {
        List<Integer> villains = Arrays.stream(v).boxed().collect(Collectors.toList());
        List<Integer> players = Arrays.stream(p).boxed().collect(Collectors.toList());
        Collections.sort(players, Collections.reverseOrder());
        Collections.sort(villains, Collections.reverseOrder());

        for (Integer player : players) {
            Integer maxVillain = Collections.max(villains);
            if (player > maxVillain) {
                villains.remove(maxVillain);
                continue;
            } else {
                return "LOSE";
            }
        }
        return "WIN";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int arraySize = scanner.nextInt();
            int[] v = new int[arraySize];
            int[] p = new int[arraySize];
            for (int j = 0; j < arraySize; j++) {
                v[j] = scanner.nextInt();
            }
            for (int j = 0; j < arraySize; j++) {
                p[j] = scanner.nextInt();
            }
            System.out.println(winOrlose(v, p));
        }
        /*System.out.println(winOrlose(new int[]{112, 243, 512, 343, 90, 478}, new int[]{500, 789, 234, 400, 452, 150})); //WIN
        System.out.println(winOrlose(new int[]{10, 20, 50, 100, 500, 400}, new int[]{30, 20, 60, 70, 90, 490})); //LOSE
        System.out.println(winOrlose(new int[]{10, 20, 30, 40, 50}, new int[]{40, 50, 60, 70, 80})); //WIN*/
    }

}
