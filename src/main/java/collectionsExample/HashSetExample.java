package collectionsExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();
        set.add("Astha");
        set.add("Kshitij");
        set.add("Kuhu");
        set.add("Way2Automation");
        set.add("Krishna");
        set.add(null);
        set.add("Kuhu");

        System.out.println("The size of set is: " +set.size());
        System.out.println(set);

        //System.out.println(set.get()); --> get method is not there in set as no index sequencing

        //fetch data in set
        //method 1:
        for(String var:set){
            System.out.println(var);
        }

        System.out.println("-----------------------------");
        //method 2:
        Iterator<String> itr = set.iterator();

        //print all the values of this set
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//
//        }

        //print the value of the cell that matches with a given value
        String var = null;
        while(itr.hasNext()){
            var = itr.next();

//            if("Krishna".equals(var)){
//                System.out.println("The value is: " +var);
//            }

            if(var!=null && var.equals("Krishna")){
                System.out.println("The value is: " +var);
            }

        }
    }
}
