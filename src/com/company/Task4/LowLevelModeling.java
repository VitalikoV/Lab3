package com.company.Task4;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class LowLevelModeling {
    public static void startThreads() throws InterruptedException, BrokenBarrierException {
        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();

        final CyclicBarrier gate = new CyclicBarrier(3);

        firstThread.start();
        secondThread.start();

        gate.await();

        firstThread.join();

    }
}
