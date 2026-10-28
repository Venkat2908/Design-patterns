package Pratise.Builder.Threads;

public class threadwait {

    synchronized  void waittime(){
        System.out.println("The thread name"+Thread.currentThread().getName() + "it is waiting");
        try {
            wait();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("The thread name"+Thread.currentThread().getName() +"it is running");
    }

    synchronized  void notifythread(){
        System.out.println("the thread is notified");
        notify();
    }

    public  static  void main (String [] args){
        threadwait tw = new threadwait();
        Thread t1 =  new Thread(()->tw.waittime(),"Thread1"
        );

        Thread t2 = new Thread(()->{
            try {
                Thread.sleep(500);
                tw.notifythread();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        },"Thread 2");

        t1.start();
        t2.start();
    }


}
