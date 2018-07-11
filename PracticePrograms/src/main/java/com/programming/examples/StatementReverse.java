package com.programming.examples;

import java.util.Stack;
import java.util.StringJoiner;

public class StatementReverse {
/*
Input String = "This is a java program";
Expected String = "program java a is This";

*/

    public static void main(String[] args) {
        String str = "This is a java program";
        String expectedStr = "program java a is This";
        StringJoiner strOutput= new StringJoiner(" ");
        Stack<String> stack = new Stack<>();
        for(String s: str.split(" ")) {
            stack.add(s);
        }
        while( !stack.isEmpty()) {
            strOutput.add(stack.pop());
        }
        System.out.println(strOutput.toString());
        System.out.println(strOutput.toString().equals(expectedStr));
    }

}
