package collectionsExample;

public class AutoBoxing {

    public static void main(String[] args) {

        int var = 10;

        Integer obj = new Integer(var); // wrapping: converting of primitive data type to an object --> AutoBoxing
        System.out.println(obj);

        int i = obj; // unwrapping: converting of an object to primitive data type --> AutoUnBoxing or UnBoxing
        System.out.println(i);
    }
}
