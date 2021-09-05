package collectionsExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        System.out.println(arrayList);
        System.out.println(arrayList.size());  // size of the list

        arrayList.add(10);
        arrayList.add("Astha");
        arrayList.add('c');
        arrayList.add(null);
        arrayList.add(true);
        arrayList.add(20.2);
        arrayList.add("Astha");

        System.out.println(arrayList);
        System.out.println("The size of list is: " +arrayList.size());

        //how to fetch value from the list
        System.out.println("The 1st value is : " + arrayList.get(0));
        System.out.println("The 4th value is : " + arrayList.get(3));

        //how to remove value from the list
        arrayList.remove(5);
        System.out.println(arrayList);
        System.out.println("The size of list is: " +arrayList.size());


        //how to fetch and print all the values of the list
        //1st method
        for(int i =0 ; i<arrayList.size(); i++){

            System.out.println(arrayList.get(i));
        }
        System.out.println("----------------------------");

        //2nd method
        for(Object var : arrayList){
            System.out.println(var);
        }
        System.out.println("----------------------------");

        //3rd method
        Iterator itr = arrayList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
