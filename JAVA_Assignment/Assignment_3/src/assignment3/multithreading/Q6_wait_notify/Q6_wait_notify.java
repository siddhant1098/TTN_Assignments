package assignment3.multithreading.Q6_wait_notify;

public class Q6_wait_notify {
    Function_class fun = new Function_class();

    public void Inner_class() {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    fun.Thread1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            public void run() {

                try {
                    fun.Thread2();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
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

    }

    public static void main(String[] args) {
        Q6_wait_notify q = new Q6_wait_notify();
        q.Inner_class();
    }
}
