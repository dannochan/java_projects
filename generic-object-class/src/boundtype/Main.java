package boundtype;


public class Main {
    public static void main(String[] args) {

        /*  generic = enabkle type (classes and interfaces ) to be parameters when defining
        *              classes, interfaces and methods
        *               a benefit is to eliminate the need to create multiple versions
        *               methods or classes for various data types.
        *               use a version for all reference data
        * */


        MyGenericClass2<Integer, Integer> genInt = new MyGenericClass2<>(1, 3);
        MyGenericClass2<Double, String> genDouble = new MyGenericClass2<>(4.2, "Done");

        // These declaration do work because the first generic paratmeter should be subclass of Number
        MyGenericClass2<Character, Double> genChar = new MyGenericClass2<>('c', 2.3);
        MyGenericClass2<String, String > genString = new MyGenericClass2<>("what?", "What?");



        System.out.println(genInt.getValue1() + " " +genInt.getValue2());
        System.out.println(genChar.getValue1() +  " " +genChar.getValue2());
        System.out.println(genDouble.getValue1() + " " + genDouble.getValue2());
        System.out.println(genString.getValue1()+ " " +genString.getValue2());


    }

}