package com.programming.examples;

/*
Divide given input list into batches of fix size.

Input: [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17]
batchSize: 3

Output:
1,2,3
4,5,6
7,8,9
10,11,12
13,14,15
16,17

Input: [1,2,3,4,5]
batchSize: 10

Output:
1,2,3,4,5

*/

import java.util.Arrays;
import java.util.List;

public class BatchPaginationExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        int batchSize = 3;
        for (int i = 0; i < list.size(); ) {
            for(int j=i ;j<i+batchSize && j < list.size();j++) {
                System.out.print(list.get(j)+ " " );
            }
            i = i + batchSize;
            System.out.println("");
        }

    }
}
