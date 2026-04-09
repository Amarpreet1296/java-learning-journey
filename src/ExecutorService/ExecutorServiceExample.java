package ExecutorService;

import java.sql.SQLOutput;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        System.out.println("Single Thread Executor Started");

        for (int i = 0; i <= 10; i++) {
            final int TaskId = i;
            singleThreadExecutor.execute(() -> {
                System.out.println("Single thread Task" + TaskId +
                        "Executed by Single Thread" + Thread.currentThread().getName());

            });
        }
        singleThreadExecutor.shutdown();


        // FixedPoolExecutor

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(4);
        System.out.println("Fixed Thread Executor Started");

        for (int i = 0; i <= 8; i++) {
            final int TaskId = i;
            fixedThreadPool.execute(() -> {
                System.out.println("Fixed Thread Pool" + TaskId+
                        "Executed by Fixed Thread"
                + Thread.currentThread().getName());
            });
        }
        fixedThreadPool.shutdown();

        //cached Thread Pool

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        System.out.println("Cached Thread Executor Started");
        for (int i = 0; i <= 8; i++) {
            final int TaskId = i;
            cachedThreadPool.execute(() -> {
                System.out.println("Cached Thread Task" + TaskId +
                        "Executed by Cached Thread" + Thread.currentThread().getName());
            });
        }
        cachedThreadPool.shutdown();


        //scheduledThreadPool

        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(2);
        System.out.println("Scheduled Thread Executor Started");
        for (int i = 0; i <= 5; i++) {
            final int TaskId = i;
            scheduledThreadPool.schedule(() -> {
                System.out.println("Schedule Thread Task" + TaskId +
                        "Executed by Scheduled Thread" + Thread.currentThread().getName());
            }, 3, TimeUnit.SECONDS);
        }
        scheduledThreadPool.shutdown();

    }
}
