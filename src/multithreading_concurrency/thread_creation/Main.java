package multithreading_concurrency.thread_creation;



public class Main {
    public static void main(String[] args) {

        Thread obj2 = new Thread(() -> {
            System.out.println("Thread 2 is running");

        });
        obj2.start();


        Runnable objRunnable = ()->{
            System.out.println("Thread 3 is running");
            System.out.println(Thread.currentThread().getState());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 3 is finished");
        };

        Thread objThread = new Thread(objRunnable);
        objThread.start();

    }
}
