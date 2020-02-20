package assignment3.multithreading.Q2_threadCreation;

class Runner1 extends Thread {
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

public class using_ThreadClass {
    public static void main(String[] args) {
        Runner1 r1 = new Runner1();
        r1.start();


    }
}



