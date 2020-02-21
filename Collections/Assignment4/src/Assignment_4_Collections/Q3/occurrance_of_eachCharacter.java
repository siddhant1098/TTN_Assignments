package Assignment_4_Collections.Q3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class occurrance_of_eachCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:- ");
        char s[] = sc.nextLine().toLowerCase().toCharArray();
        Map<Character, Integer> occurrance = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            int count = 0;
            for (int j = 0; j < s.length; j++) {
                if (s[i] == s[j]) {
                    ++count;
                }
            }
            occurrance.put(s[i], count);
        }
        System.out.println("Frequency of each character in the string is:- ");
        for (char chars : occurrance.keySet()) {
            System.out.println(chars + ": " + occurrance.get(chars));
        }
    }
}

