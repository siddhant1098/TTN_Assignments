package Assignment_4_Collections.Q7;


import java.util.*;

public class sameFrequency {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
        hm.put("Pineapple", 85);
        hm.put("Pineapple", 86);
        hm.put("Pineapple1", 86);
        hm.put("Pineapple2", 86);

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