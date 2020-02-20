package assignment3.multithreading.Q2_threadCreation;

class Runner2 implements Runnable {
    @Override
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

}

public class using_Runnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runner2());
        t1.start();


    }
}



