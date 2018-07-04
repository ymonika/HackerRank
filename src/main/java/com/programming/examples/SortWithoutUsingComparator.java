package com.programming.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortWithoutUsingComparator {

    public static void main(String[] args) {
        String[] array = {"a", "beb", "bea", "zd", "xf"};

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                String iStr = array[i];
                String jStr = array[j];
                if(iStr.compareTo(jStr) > 0 ) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j]=temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        List<String> list = Arrays.asList(array);
        list.sort(String::compareTo);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }
}
