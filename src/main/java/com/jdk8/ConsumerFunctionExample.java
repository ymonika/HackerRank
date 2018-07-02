package com.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionExample {

    public static void main(String[] args) {
        Consumer<Integer> consumer = i -> System.out.println(" " + i);
        List<Integer> integerList = Arrays.asList(new Integer(1),
                new Integer(10), new Integer(200),
                new Integer(101), new Integer(-10),
                new Integer(0));
        integerList.forEach(i -> consumer.accept(i));

    }

}
