package com.programming.examples;

/*
Nested class & Inner class Example
NestedInnerClass is a static inner class:

Non-static inner class should not have any static method.

*/

public class NestedClassExamples {

    static int data = 30;

    static class NestedInnerClass {
        public void method1() {
            System.out.println("Inner class method...." + data);
        }

        static public void method2() {
            System.out.println("Static method call..." + data);
        }
    }

    class InnerClass {
        public void method1() {
            System.out.println("InnerClass method...");
        }
        /*static public void methodStatic() {
            System.out.println(" static InnerClass method...");
        }*/
    }
}

class Main {

    public static void main(String[] args) {
        NestedClassExamples.NestedInnerClass nestedInnerClass = new NestedClassExamples.NestedInnerClass();
        nestedInnerClass.method1();
        NestedClassExamples.NestedInnerClass.method2();

        NestedClassExamples outerClass = new NestedClassExamples();
        NestedClassExamples.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.method1();

    }

}

