package com.jdk8;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        Interface1 interface1 = (str) -> System.out.println(str);

        Interface1 interface2 = new Interface1() {
            @Override
            public void print(String str) {
                System.out.println(str);
            }
        };

        interface1.print("FunctionalInterface example1");
        interface2.print("FunctionalInterface example2");

    }
}

@FunctionalInterface
interface Interface1 {

    void print(String str);
}
