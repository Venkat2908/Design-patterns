package Pratise.Builder.Threads;

public class thread extends Thread {


    @Override
    public void run() {
        for (int i =0;i<5;i++){
            System.out.println("thread name"+thread.currentThread().getName() +"value "+i);

            try {
                thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println("thread interupted");
            }
        }

    }

    public  static void main (String[] args){

        thread th = new thread();
        thread t2= new thread();
        th.start();
        t2.start();
    }
}
