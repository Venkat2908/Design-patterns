package Oops.Threads;

import java.util.concurrent.*;

public class callable implements Callable<String> {

    private String name;

    public callable(String name){
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        StringBuilder results = new StringBuilder();
        for (int i =0;i<5;i++){
            results.append("callable ").append(name).append("is running ").append(i).append("n");
            Thread.sleep(500);
        }

        return results.toString();
    }

    public static  void main (String [] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Callable<String> cal1 = new callable("task1");
        Callable<String> cal2 = new callable("task2");

        Future<String> f1 = executorService.submit(cal1);
        Future<String> f2 = executorService.submit(cal2);



        System.out.println("The task 1 details");
        System.out.println(f1.get());

        System.out.println("the task 2 details");
        System.out.println(f2.get());

        executorService.shutdown();

    }
}
