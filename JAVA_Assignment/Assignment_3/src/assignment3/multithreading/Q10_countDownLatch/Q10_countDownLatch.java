package assignment3.multithreading.Q10_countDownLatch;

import java.util.concurrent.CountDownLatch;

public class Q10_countDownLatch {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(2);
        ExampleCountDownLatch exampleCountDownLatch1 = new ExampleCountDownLatch(latch);
        ExampleCountDownLatch exampleCountDownLatch2 = new ExampleCountDownLatch(latch);

        exampleCountDownLatch1.start();
        exampleCountDownLatch2.start();

        latch.await();

        System.out.println("Count = " + latch.getCount());
    }
}

class ExampleCountDownLatch extends Thread {
    private CountDownLatch latch;

    public ExampleCountDownLatch(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        try {
            Thread.sleep(1000);
            latch.countDown();
            System.out.println("hey there");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}