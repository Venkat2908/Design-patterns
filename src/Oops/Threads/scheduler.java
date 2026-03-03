package Oops.Threads;

import java.util.concurrent.*;

public class scheduler {
    public static  void main (String [] args){
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        scheduledExecutorService.schedule(()->{
           System.out.println("the outuptis executed after 3 seconds");
        },3, TimeUnit.SECONDS);

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        executor.submit(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
            }
        });

        System.out.println("Active Threads: " + executor.getActiveCount());
        System.out.println("Queued Tasks: " + executor.getQueue().size());
    }
}
