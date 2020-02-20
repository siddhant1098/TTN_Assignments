package assignment3.multithreading.Q4_Synchronization;

public class Q4_synchronizationBlock {
    private int count = 0;

    public void synchronizationblock() {
        synchronized (this) {
            count++;
        }
    }

    public void Inner_class() {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while (i < 1000) {
                    i++;
                    synchronizationblock();

                }
                System.out.println("Count is: " + count);

            }
        });
        t1.start();

    }

    public static void main(String[] args) {
        Q4_synchronizationBlock q = new Q4_synchronizationBlock();
        q.Inner_class();

    }
}
