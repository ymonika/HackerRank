package com.jdk8;

import java.util.*;

/*
jdk8 Examples:

Comparator.comparing()


 */

public class ComparatorExample {

    public static void main(String[] args) {

        List<DVDInfo> list = new ArrayList();
        String strArray = "Donnie Darko/sci-fi/Gyllenhall, Jake\n" +
                "Raiders of the Lost Ark/action/Ford, Harrison\n" +
                "2001/sci-fi/??\n" +
                "Caddy Shack/comedy/Murray, Bill\n" +
                "Star Wars/sci-fi/Ford, Harrison\n" +
                "Lost in Translation/comedy/Murray, Bill\n" +
                "Patriot Games/action/Ford, Harrison";
        for(String line: strArray.split("\n")) {
            String[] dvdInfo = line.split("/");
            list.add(new DVDInfo(dvdInfo[0], dvdInfo[1], dvdInfo[2]));
        }
        Collections.sort(list, Comparator.comparing(DVDInfo::getLeadActor).thenComparing(DVDInfo::getGenre).thenComparing(DVDInfo::getTitle).reversed());

        System.out.println(Arrays.asList(list.toArray()));

    }
}

class DVDInfo {

    String title;
    String genre;
    String leadActor;
    DVDInfo(String t, String g, String a) {
        title = t; genre = g; leadActor = a;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLeadActor() {
        return leadActor;
    }

    public void setLeadActor(String leadActor) {
        this.leadActor = leadActor;
    }

    public String toString() {
        return leadActor + " : " + genre + " : " + title + "\n";
    }

}