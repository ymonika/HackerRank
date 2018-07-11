package com.jdk8.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class NewComparatorApi {

    public static void main(String[] args) {

        System.out.println("Some new apis under Comparator");

        List<String> list1 = new ArrayList<>();
        list1.add("A");list1.add("B");list1.add("AA");
        list1.add("A");list1.add("SB");list1.add("ADA");list1.add("QFA");

        list1.sort(Comparator.naturalOrder());
        list1.sort(Comparator.reverseOrder());

        list1.stream()										   // Stream<String>
                .collect(Collectors.toCollection(LinkedList::new)) // LinkedList<String>
                .descendingIterator()							   // Iterator<String>
                .forEachRemaining(System.out::println);
    }
}
