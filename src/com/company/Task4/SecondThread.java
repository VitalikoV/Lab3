package com.company.Task4;

public class SecondThread extends Thread{
    @Override
    public void run() {
        Calculate.multiply(2, 5);
        Calculate.divide(30,10);
        Calculate.subtract(8, 5);
        Calculate.sum(1,2);
    }
}
