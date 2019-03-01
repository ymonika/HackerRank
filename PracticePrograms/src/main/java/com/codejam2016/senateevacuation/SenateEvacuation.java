package com.codejam2016.senateevacuation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

//https://code.google.com/codejam/contest/4314486/dashboard

public class SenateEvacuation {

    public static String find(int noOfParties, int[] partySenate) {
        String result = "";
        int totalSenate = Arrays.stream(partySenate).sum();
        while (totalSenate > 0) {
            int max1 = 0, max2 = 0;
            int max1Index = -1, max2Index = -1;
            for (int i = 0; i < noOfParties; i++) {
                if (partySenate[i] > max1) {
                    max2 = max1; max2Index = max1Index;
                    max1 = partySenate[i]; max1Index = i;
                } else if (partySenate[i] > max2) {
                    max2 = partySenate[i]; max2Index = i;
                }
            }

            char senate1 = (char) ('A'+max1Index);
            char senate2 = (char) ('A'+max2Index);
            partySenate[max1Index]=--partySenate[max1Index];

            result =result + (senate1);
            if(max2Index != -1) {
                result +=(senate2) + " ";
                partySenate[max2Index]=--partySenate[max2Index];
            }
            totalSenate -= 2;
        }
        return result;
    }

    static boolean checkForMajority(int max1, int max1Index, int[] partySenate) {

        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {

//        Scanner in = new Scanner(new BufferedReader(new FileReader("/home/ee/personal/JavaProgrammingExamples/PracticePrograms/src/main/java/com/codejam2016/senateevacuation/B-large-practice.in")));
       /* Scanner in = new Scanner(new BufferedReader(new FileReader("/home/ee/personal/JavaProgrammingExamples/PracticePrograms/src/main/java/com/codejam2016/senateevacuation/A-small-practice.in")));
        int n = in.nextInt();
        for (int i = 1; i <= n; ++i) {
            int m = in.nextInt();
            int[] array = new int[m];
            for(int ii=0;ii<m;ii++){
                array[ii] = in.nextInt();
            }
            System.out.println("Case #" + i + ": " + find(m, array));
        }*/
        //System.out.println(find(3,new int[]{1,1,1}));
       /* System.out.println(find(2,new int[]{2,2}));
        System.out.println(find(3,new int[]{3,2,2}));
        System.out.println(find(3,new int[]{1,1,2}));
        System.out.println(find(3,new int[]{2,3,1}));*/
        System.out.println(find(3,new int[]{3,1,1}));

    }
/*
4
2
2 2
3
3 2 2
3
1 1 2
3
2 3 1

Case #1: AB BA
Case #2: AA BC C BA
Case #3: C C AB
Case #4: BA BB CA

*/
}
