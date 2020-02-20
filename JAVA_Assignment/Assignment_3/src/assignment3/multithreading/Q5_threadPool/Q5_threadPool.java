package assignment3.multithreading.Q5_threadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;


class book implements Runnable {

    private int bookid;

    public book(int bookid) {
        this.bookid = bookid;
    }

    public void run() {
        System.out.println("Issued: " + bookid);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

        System.out.println("Returned " + bookid);
    }
}


public class Q5_threadPool {

    public static void main(String[] args) {
        ExecutorService libraian = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 20; i++) {
            libraian.submit(new book(100 + i));
        }


        System.out.println("Book issue/return.");

        try {
            libraian.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
        }
        System.out.println("All books returned.");

    }
}