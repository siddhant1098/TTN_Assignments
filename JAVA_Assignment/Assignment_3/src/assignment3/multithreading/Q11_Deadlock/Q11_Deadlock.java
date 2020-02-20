package assignment3.multithreading.Q11_Deadlock;

public class Q11_Deadlock {
    public static void main(String[] args) {
        String text1 = "Thread 1 Text";
        String text2 = "Thread 2 Text";

        Thread t1 = new Thread() {
            public void run() {
                synchronized (text1) {
                    System.out.println("Text of text1 is in thread");


                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (text2) {

                        System.out.println("Text of text2 is in thread");
                    }
                }
            }
        };


        Thread t2 = new Thread() {
            public void run() {
                synchronized (text2) {
                    System.out.println("Text of text2 is in thread");


                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (text1) {

                        System.out.println("Text of text1 is in thread");
                    }
                }
            }
        };
        t1.start();
        t2.start();

    }

}
