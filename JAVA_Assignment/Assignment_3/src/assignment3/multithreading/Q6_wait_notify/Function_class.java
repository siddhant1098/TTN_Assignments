package assignment3.multithreading.Q6_wait_notify;

import java.util.Scanner;

public class Function_class {
    public void Thread1() throws InterruptedException {

        synchronized (this) {
            System.out.println("Thread 1 Started");
            try {
                wait();
                System.out.println("Thread 1 Resumed");


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker 1 Done");
        }
    }

    public void Thread2() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Thread.sleep(1000);

        synchronized (this) {
            System.out.println("Waiting for return key.");
            scanner.nextLine();
            System.out.println("Return key pressed.");
            notify();
            Thread.sleep(1000);
        }
    }
}

