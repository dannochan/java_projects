import java.io.*;

public class Main {
    public static void main(String[] args) {


        /*
        Steps to deserilization: 1. declare your object ( dont instantiate
                               2. object class should implement Serialiazable interface
                               3. add import java.io.Serializable
                               4. FileinputStream create an InputStream to read file
                               5. ObjectInputSteam
                               6. ObjectName = (Class) objectInputStream.readObject()
                               7. close everything
        * */

        /* serialVersionUID =  The serialization runtime associates with each serializable class a version number
                                it is used during deserialization to verify that the sender and receiver
                                of a serialized object have loaded classes for that object that are compatible with
                                respect to serialization.
                               If the receiver has loaded a class for the object that has a different serialVersionUID
                               than that of the corresponding sender's class, then deserialization will result
                                in an InvalidClassException.
                                it must be declared as static, final and long;
        * */


        // declare a user assign to null

        User user = null;


        try{
            // read ser file
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Fujitsu\\Documents\\GitHub\\java_projects\\serializer-project\\userInfo.ser");

            // input stream
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            user = (User) objectInputStream.readObject();

            objectInputStream.close();
            fileInputStream.close();

            System.out.println(user.getName());
            System.out.println(user.getPassword());

            user.sayHello();



        } catch (FileNotFoundException e) {
            throw new RuntimeException("File cannot be found! ", e.getCause());
        } catch (IOException e) {
            throw new RuntimeException(" File cannot be read", e.getCause());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Class cannot be found", e.getCause());
        }

        // SerialVersionUID
        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);



    }
}