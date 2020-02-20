package assignment3.multithreading.Q4_Synchronization;

public class Q4_synchronizationMethod {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public static void main(String[] args) {
        Q4_synchronizationMethod q = new Q4_synchronizationMethod();
        q.Inner_class();
    }

    public void Inner_class() {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while (i < 1000) {
                    increment();
                    i++;
                }

            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while (i < 1000) {
                    increment();
                    i++;
                }
            }
        });
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (
                InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count is: " + count);
    }

}
