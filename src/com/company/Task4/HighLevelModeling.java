package com.company.Task4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HighLevelModeling {
    public static void startThreads(){
        ExecutorService service = Executors.newFixedThreadPool(3);
        service.execute(new Runnable() {
            public void run() {
                Calculate.multiply(2, 5);
            }
        });
        service.execute(new Runnable() {
            public void run() {
                Calculate.divide(30,10);
            }
        });
        service.execute(new Runnable() {
            public void run() {
                Calculate.subtract(8, 5);
            }
        });
        service.execute(new Runnable() {
            public void run() {
                Calculate.sum(1,2);
            }
        });
        service.shutdown();
    }
}
