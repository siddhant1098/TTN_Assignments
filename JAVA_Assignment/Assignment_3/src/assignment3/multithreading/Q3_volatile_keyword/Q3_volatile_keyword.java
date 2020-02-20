package assignment3.multithreading.Q3_volatile_keyword;

import java.util.Scanner;

class Runner3 extends Thread {
    private volatile boolean end = true;

    @Override
    public void run() {
        System.out.println("Starting the Program");

        int i = 1;
        while (end) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            System.out.println(i);
            i++;
        }

    }


    public void end_program() {
        end = false;
    }

}

public class Q3_volatile_keyword {
    public static void main(String[] args) {
        Runner3 r1 = new Runner3();
        r1.start();

        System.out.println("Press Key to end Program");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        r1.end_program();


    }
}

