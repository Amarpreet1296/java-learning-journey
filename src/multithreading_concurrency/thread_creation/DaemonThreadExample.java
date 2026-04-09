package multithreading_concurrency.thread_creation;

public class DaemonThreadExample {

    public static void main(String[] args) {

    Thread daemonThread = new Thread(()-> {
        while (true) {
            System.out.println("Daemon Thread is running...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });
    daemonThread.setDaemon(true); // this is req
        daemonThread.start();

    }
}
