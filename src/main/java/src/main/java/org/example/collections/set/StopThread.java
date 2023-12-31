package org.example.collections.set;


import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

public class StopThread {
    private static boolean stopRequested;
    public static void main(String[] args)
            throws InterruptedException {
        Object ob = new Object();
        ConcurrentMap<String, String> cm;
        Thread backgroundThread = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while (!stopRequested) {
                    i++;
                    System.out.println(i);
                }
            }
        });
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
//        System.out.println(++i);
    }
}
