package assignment3.multithreading.Q7_sleep_join;

public class Q7_sleep_join {
    public void Inner_class() {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Starting the Program");

                int i = 1;
                while (i <= 10) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }

                    System.out.println(i);
                    i++;
                }
            }
        });

        t1.start();

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Starting the Program");

                int i = 1;
                while (i <= 10) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }

                    System.out.println(i);
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

    }

    public static void main(String[] args) {
        Q7_sleep_join q = new Q7_sleep_join();
        q.Inner_class();
    }
}

