package assignment.java2;

public class Q11_nested_while {
    public static void main(String[] args){
        int s = 0;
        int t = 1;
        int i = 0;
        while (i < 10)
        {
            s = s + i;
            int j=i;
            while ( j > 0)
            {
                t = t * (j - i);
                j--;
            }
            s = s * t;
            System.out.println("T is " + t);
            i++;
        }
        System.out.println("S is " + s);
        }

    }