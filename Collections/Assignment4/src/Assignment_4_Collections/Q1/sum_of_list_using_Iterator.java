package Assignment_4_Collections.Q1;

import java.util.*;


public class sum_of_list_using_Iterator {

    public static void main(String[] args) {
        List<Float> list = new ArrayList<Float>();

        list.add(4.26f);
        list.add(3.26f);
        list.add(2.26f);
        list.add(1.26f);
        list.add(0.26f);

        System.out.print("ELements in List are:- ");
        float sum = 0;
        Iterator<Float> it = list.iterator();
        while (it.hasNext()) {
            float value = it.next();
            System.out.println(value);
            sum += value;

        }
        System.out.println("Sum of the list  " + sum);

    }


}