package assignment3.multithreading.Q8_callable_future;

import java.util.ArrayList;
import java.util.List;

import java.util.concurrent.*;

public class Q8_callable_future {
    public static void main(String[] args) throws InterruptedException {
        var runnableList = new ArrayList<Callable<Integer>>();

        runnableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 1;
            }
        });
        runnableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 2;
            }
        });

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        List<Future<Integer>> futureList = executorService.invokeAll(runnableList);

        for (Future<Integer> e : futureList) {
            if (e.isDone()) {
                try {
                    System.out.println("isDone(): " + e.isDone());
                    System.out.println("get(): " + e.get());
                    System.out.println("isCancelled(): " + e.isCancelled() + "\n");
                } catch (ExecutionException e1) {
                    e1.printStackTrace();
                }
            }
        }
        executorService.shutdownNow();

    }
}