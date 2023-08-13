package genmethod;

public class Main {
    public static void main(String[] args) {

        /*  generic = enabkle type (classes and interfaces ) to be parameters when defining
         *              classes, interfaces and methods
         *               a benefit is to eliminate the need to create multiple versions
         *               methods or classes for various data types.
         *               use a version for all reference data
         * */

        Integer[] integerArray = {1, 2, 3, 4, 5};

        Character[] charArray = {'H', 'E', 'L', 'L', 'o'};

        Double[] doubleArray = {5.5, 4.3, 4.2, 3.2, 4.1};

        String[] stringArray = {"Bye", "Bye!", "Byeee"};

        displayArray(integerArray);
        displayArray(charArray);
        displayArray(doubleArray);
        displayArray(stringArray);

        System.out.println(getFirst(integerArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(stringArray));

    }

    // declare a generic method accepts different types of array
    // add value in <>/( common practice : <T> ) behind static
    public static<Thing> void displayArray(Thing[] things){
        for(Thing x : things){
            System.out.print( x + " ");
        }
        System.out.println();
    }

    // declare a generic method return an object
    public static<Thing> Thing getFirst(Thing[] things){
        return things[0];
    }
}