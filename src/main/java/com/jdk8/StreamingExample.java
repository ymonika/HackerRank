package com.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
jdk8 stream example

 */
public class StreamingExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");list.add("B");list.add("AA");list.add("QA");list.add("WA");list.add("ERA");
        list.add("A");list.add("SB");list.add("ADA");list.add("QFA");list.add("WGA");list.add("ERHA");

        List<String> list1 = list.stream()
                    .map(str -> str + str)
                    .filter(s -> s.length() > 2)
                    .collect(Collectors.toList());

        System.out.println(list1);

    }
}
