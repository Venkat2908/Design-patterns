package Pratise.Builder.Threads;

public class Mythreadusingrunnable implements Runnable {
    @Override
    public void run() {
        for (int i =0;i<4;i++){
            System.out.println("Thread Name"+Thread.currentThread().getName() +"value"+i);

            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println("Thread exepction");
            }
        }
    }

    public  static  void main (String [] args){
        Runnable runnable = new Mythreadusingrunnable();

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();

        }
}
