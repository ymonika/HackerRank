package com.hacker.rank;

import java.util.Scanner;

public class HappyNewYear {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int arraySize = scanner.nextInt();
            int[] array = new int[arraySize];
            for (int j = 0; j < arraySize; j++) {
                array[j] = scanner.nextInt();
            }
            System.out.println(happyNewYear(array, arraySize));
        }
    }

    private static int happyNewYear(int[] array, int arraySize) {
        int max1 = 0, max2 = 0, max3 = 0;
        int max1Index = 0, max2Index = 0, max3Index = 0;
        for (int i = 0; i < arraySize; i++) {
              if(array[i] > max1) {
                  max3 = max2; max3Index = max2Index;
                  max2 = max1; max2Index = max1Index;
                  max1 = array[i]; max1Index = i;
              } else if(array[i] > max2) {
                  max3 = max2; max3Index = max2Index;
                  max2 = array[i]; max2Index = i;
              } else if(array[i] > max3) {
                  max3 = array[i]; max3Index = i;
              }
        }
        System.out.println(max1 +" "+ max1Index);
        System.out.println(max2 +" "+ max2Index);
        System.out.println(max3 +" "+ max3Index);
        return 0;
    }
    /*
    Neighbours and New Year Party (100 Marks)
In the XYZ society, the neighbours hate each other for their attitude.
Various activities are organized in the society for Welcoming the New Year.
The tickets were provided to each house with an integer written on it.
Some got tickets with positive integers and some got tickets with negative integers.
In the evening, people had to carry their tickets to the club house where the eligible ones will get the exciting gifts.
The eligibility of winning the gift depends on the maximum sum which can be formed from the tickets numbers keeping in mind
that neighbours hate each other.
Since the neighbours hate each other, the two cannot be together in the list of maximum sum.

The President of the society, Mr. Singh, is a wise man and know that neighbours in society don't like each other. Also,
he don't wish to become bad in front of people.
So, he came up with an idea to design a program which will provide the list of integers forming maximum sum and thus all the
members of the list will be given the gifts.
The only problem with this idea is that he don't know programming so he is asking you to provide the correct list of integers.
The people may be annoying but are smart and will fight if the list provided by you doesn't form the maximum sum.


Note: The integer written on ticket of individuals may or may not be unique. In case, when there are two list with equal maximum sum,
the list with first greater element would be considered. For better understanding, look at the explanation of Test case 4 in Sample Test Case.
The tickets with integer 0 are not considered for winning the gifts and there is atleast one ticket with positive integer.


Input Format
The first line of input consist of number of test cases, T.

The first line of each test case consist of the number of houses (tickets distributed) in society, N.

The second line of each test case consist of N space separated tickets with integer written on them.




Constraints
1<= T <=10

1<= N <=10000

-1000<= Integer_on_Ticket <=1000



Output Format
For each test case, print the ticket numbers in a single line forming the maximum sum in the format similar to Sample Test Case.

Sample TestCase 1
Input
6
5
-1 7 8 -5 4
4
3 2 1 -1
4
11 12 -2 -1
4
4 5 4 3
4
5 10 4 -1
3
3 2 0
Output
48
13
12
44
10
3
Explanation
Test Case 1: Maximum sum which can be formed is 12. Element considered 8, 4. Note that Output is printed from the reverse side of the array which is TRUE for all the test cases without the space. So, the output is 48.
Test Case 2: Maximum sum which can be formed is 4. Element considered 3, 1. Output = 13.
Test Case 3: Maximum sum which can be formed is 12 as by taking any other element value of maximum sum decreases.
Test Case 4: Maximum sum which can be formed is 8 by taking 3, 5 or 4, 4. But the output is 4, 4 as 3 is smaller than 4.
Test Case 5: Maximum sum which can be formed is 10.
Test Case 6: Carefully observe that output is 3 but not 03, as tickets with 0 are not considered for winning. Though 0 and 3 can be in the list of maximum sum.
     */
}
