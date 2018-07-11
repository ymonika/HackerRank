package com.equals.hashcode;

public class VolatileExample {
    private static volatile Integer MY_INT = 0;

    public static void main(String[] args) {
        new ChangeListener().start();
        new ChangeMaker().start();
    }

    static class ChangeListener extends Thread {
        @Override
        public void run() {
            int local_value = MY_INT;
            while ( local_value < 5){
                if( local_value!= MY_INT){
                    System.out.println("Got Change for MY_INT : {0}" + MY_INT);
                    local_value= MY_INT;
                }
            }
        }
    }

    static class ChangeMaker extends Thread{
        @Override
        public void run() {

            int local_value = MY_INT;
            while (MY_INT <5){
                System.out.println( "Incrementing MY_INT to {0}" + local_value);
                MY_INT = ++local_value;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) { e.printStackTrace(); }
            }
        }
    }
}

/*
Incrementing MY_INT to {0}01
Got Change for MY_INT : {0}1
Incrementing MY_INT to {0}11
Got Change for MY_INT : {0}2
Incrementing MY_INT to {0}21
Got Change for MY_INT : {0}3
Incrementing MY_INT to {0}31
Got Change for MY_INT : {0}4
Incrementing MY_INT to {0}41
Got Change for MY_INT : {0}5
 */

/*
Incrementing MY_INT to {0}01
Got Change for MY_INT : {0}1
Incrementing MY_INT to {0}11
Incrementing MY_INT to {0}21
Incrementing MY_INT to {0}31
Incrementing MY_INT to {0}41
 */