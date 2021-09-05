package collectionsExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericArrayListExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(15);
        list.add(null);
        System.out.println("The size of list is: " + list.size());
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        int i = list.get(0);
        i = i+5;
        System.out.println("the value of i is: " + i);
        System.out.println(list);

        //list.add(0, i);  --> here it added i to 0th index and moved other values to next indices
        list.set(0, i);   // --> set updates the value at required index
        System.out.println(list);
        System.out.println(list.get(0));
    }
}
