package com.hacker.rank;

import java.time.LocalDate;

public class LibraryFine {

    static boolean isReturnDateBeforeDuedate(int d1, int m1, int y1, int d2, int m2, int y2) {
        LocalDate returnDate = LocalDate.of(y1,m1,d1);
        LocalDate dueDate = LocalDate.of(y2,m2,d2);
        return returnDate.isBefore(dueDate);
    }

    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int fine = 0;
        if(isReturnDateBeforeDuedate( d1,  m1,  y1,  d2,  m2,  y2)) {
            return fine;
        }
        if(y1==y2 ) {
            if(m1==m2) {
                if(d1==d2) {
                    fine = 0;
                } else {
                    fine += 15 * Math.abs(d1-d2);
                }
            } else {
              fine += 500 * Math.abs(m2-m1);
            }
        } else
         {
            fine = 10_000;
        }
        return fine;
    }

    public static void main(String[] args) {

        System.out.println(libraryFine(9,6,2014,6,6,2015));

    }
}
