package com.jdk8.comparator;

import java.util.*;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<DVDInfo> treeSet = new TreeSet<>(Comparator.comparing(DVDInfo::getTitle).thenComparing(DVDInfo::getGenre).thenComparing(DVDInfo::getLeadActor));
        treeSet.add(new DVDInfo("Avengers", "sci-fi", "Tom H"));
        treeSet.add(new DVDInfo("Avengers", "sci-fi", "Chris Evan"));
        treeSet.add(new DVDInfo("Avengers", "sci-fi", "Chris Hem"));

        //TreeSet<DVDInfo> treeSet = new TreeSet<>(Collections.reverseOrder());
        // this will result in exception as Comparable is not implemented

        //System.out.println(treeSet);
        /*for(DVDInfo dvdInfo : treeSet) {
            System.out.println(dvdInfo);
        }*/
        /*Iterator<DVDInfo> itr = treeSet.descendingIterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
            itr.remove();
        }*/

        Spliterator<DVDInfo> spliterator1 = treeSet.spliterator();
        Spliterator<DVDInfo> spliterator2 = spliterator1.trySplit();
        Spliterator<DVDInfo> spliterator3 = spliterator1.trySplit();

        spliterator1.forEachRemaining(System.out::println);
        System.out.println("-------------------");
        spliterator2.forEachRemaining(System.out::println);
        System.out.println("-------------------");
        spliterator3.forEachRemaining(System.out::println);
    }
}