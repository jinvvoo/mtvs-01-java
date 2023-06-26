package com.ohgiraffers.section01;

public class Car extends Thread {

    public void run() {

        for (int i = 0; i < 1000; i++) {
            System.out.println("Car driving...");
            Thread.sleep(1);

        }
    }
}
