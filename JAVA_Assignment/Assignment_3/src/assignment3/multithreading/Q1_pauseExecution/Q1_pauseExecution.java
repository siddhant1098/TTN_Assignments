package assignment3.multithreading.Q1_pauseExecution;

class Runner extends Thread {
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

public class Q1_pauseExecution {
    public static void main(String[] args) {
        Runner r1 = new Runner();
        r1.start();


    }
}
