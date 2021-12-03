package com.company.Task4;

public class FirstThread extends Thread{
    @Override
    public void run() {
        Calculate.sum(1,2);
        Calculate.subtract(8, 5);
        Calculate.divide(30,10);
        Calculate.multiply(2, 5);
    }
}
