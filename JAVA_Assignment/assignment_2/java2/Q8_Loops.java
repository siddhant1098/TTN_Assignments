package assignment.java2;
import java.lang.*;
import java.util.Scanner;

public class Q8_Loops {
    public static class while_loop {
        public void get_data(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Word for while loop:-");
        String word = input.next();
        String s =word.toLowerCase();
    while(!s.equals("done"))
            {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                System.out.println("First and last character are equals for the word: " + word);
            } else {
                System.out.println("First and last character are NOT equals for the word: " + word);
            }
            word = input.next();
        }

    }  }
    public static class Do_while_loop {
        public void get_data(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Word for do while loop:-");
        String word = input.next();
        String s =word.toLowerCase();

        do
        {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                System.out.println("First and last character are equals for the word: " + word);
            } else {
                System.out.println("First and last character are NOT equals for the word: " + word);
            }
            word = input.next();
        }while(!s.equals("done")||!word.equals("DONE"));
    }}

    public static void main(String[] args) {
        while_loop w = new while_loop();
        Do_while_loop d = new Do_while_loop();
        w.get_data();
        d.get_data();



    }
}