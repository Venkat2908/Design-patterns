package Oops.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerThread implements Runnable {

    private  int  taskid ;

    public  WorkerThread(int taskid){
        this.taskid = taskid;
    }
    @Override
    public void run() {
        System.out.println("The task is running "+taskid);
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("the task has been complted"+taskid);
    }
    public  static  void  main (String [] args){

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i =0;i<=5;i++){
            executorService.submit(new WorkerThread(i));
        }
        executorService.shutdown();
    }
}
