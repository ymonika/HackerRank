package com.jdk8;

import java.util.function.Function;

public class ConsumerFunctionExample {

    public static void main(String[] args) {
//        Consumer<Integer> consumer = i -> System.out.println(" " + i);
//        List<Integer> integerList = Arrays.asList(new Integer(1),
//                new Integer(10), new Integer(200),
//                new Integer(101), new Integer(-10),
//                new Integer(0));
//        integerList.forEach(i -> consumer.accept(i));
//
//        Supplier<Integer> supplier = () -> new Integer(0);
//        consumer.accept(supplier.get());

        Function<String, String> strConcat = str -> str + "Concat";
        System.out.println(strConcat.apply("str"));

        method("MONIKA", str -> str + str);
    }

    public static void method(String s, StringAddition stringAddition) {
        System.out.println(stringAddition.concat(s));
    }

    interface StringAddition {
        String concat(String str);
    }

}
