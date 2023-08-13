package genclass;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        /*  generic = enabkle type (classes and interfaces ) to be parameters when defining
        *              classes, interfaces and methods
        *               a benefit is to eliminate the need to create multiple versions
        *               methods or classes for various data types.
        *               use a version for all reference data
        * */

        MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
        MyGenericClass<Character> myChar = new MyGenericClass<>('c');
        MyGenericClass<Double> myDouble = new MyGenericClass<>(4.2);
        MyGenericClass<String> myString = new MyGenericClass<>("what?");

        // this syntax is similar with declaring an arrayList
        ArrayList<Integer> my = new ArrayList<>();

        System.out.println(myInt.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myString.getValue());

        MyGenericClass2<Integer, Integer> genInt = new MyGenericClass2<>(1, 3);
        MyGenericClass2<Character, Double> genChar = new MyGenericClass2<>('c', 2.3);
        MyGenericClass2<Double, String> genDouble = new MyGenericClass2<>(4.2, "Done");
        MyGenericClass2<String, String > genString = new MyGenericClass2<>("what?", "What?");

        // this is pretty similar to hashmap
        HashMap<Integer, String> user = new HashMap<>();

        System.out.println(genInt.getValue1() + " " +genInt.getValue2());
        System.out.println(genChar.getValue1() +  " " +genChar.getValue2());
        System.out.println(genDouble.getValue1() + " " + genDouble.getValue2());
        System.out.println(genString.getValue1()+ " " +genString.getValue2());


    }

}