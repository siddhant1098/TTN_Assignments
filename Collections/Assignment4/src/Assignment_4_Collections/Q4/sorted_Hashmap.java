package Assignment_4_Collections.Q4;


import java.util.*;

public class sorted_Hashmap {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("Pineapple", 85);
        hm.put("Apple", 91);
        hm.put("Mango", 79);
        hm.put("Kiwi", 80);
        Set<Map.Entry<String, Integer>> set = hm.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o1.getValue()).compareTo( o2.getValue() );
            }
        } );
        for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+" - "+entry.getValue());

    }
}}