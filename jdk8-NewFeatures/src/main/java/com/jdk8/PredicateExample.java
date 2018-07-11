package com.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Person> isMinor = person -> person.age < 18;
        Predicate<Person> isNameStartsWithA = person -> person.name.startsWith("A");

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(78, "Amitabh"));
        personList.add(new Person(17, "Naina"));
        personList.add(new Person(42, "Abhishek"));
        personList.add(new Person(7, "Aaradhya"));

        System.out.println("List of Minor people: ");
        for (Person person : personList) {
            if (isMinor.test(person)) {
                System.out.println(person.toString());
            }
        }
        System.out.println("List of  \"Minor + NameStartsWithA\" people: ");
        for (Person person : personList) {
            if (isMinor.and(isNameStartsWithA).test(person)) {
                System.out.println(person.toString());
            }
        }
    }
}

class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " is " + age + " years";
    }
}
