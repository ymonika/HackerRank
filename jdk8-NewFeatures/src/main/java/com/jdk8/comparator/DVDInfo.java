package com.jdk8.comparator;

public class DVDInfo {

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
        return leadActor + " : " + genre + " : " + title + "";
    }

}
