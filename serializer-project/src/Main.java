import java.io.*;

public class Main {
    public static void main(String[] args) {

        /*  Serialization =  The process of converting an object into a byte stream
                              Persiss ( saves the state ) the object after program exist.
                              This byte strean can be saved as a file or sent over a network
                              can be sent to a different machine.
                               Byte stream stream can be saved as a file (.ser) which is platform
                               independent
            Deserialization = the reserve process of converting a byte stream into an obejct.
        * */

        /*
        Steps to serilization: 1. Ur object should implement serializable interface
                               2. add import java.io.Serialiazable
                               3. FileOutputStream -> define path to output and name the file
                               4. ObjectOutputStream -> define which file to write byte stream
                               5. writeObject(objectName)
                               6. close everything
        * */

        // define a taget object which will be put into stream
        User user = new User();
        user.setName("Bro code");
        user.setPassword("password123");
//        user.name ="Bro";
//        user.password="PASSWORT";

        System.out.println(user.getName());
        System.out.println(user.getPassword());
        user.sayHello();

        // SerialVersionUID
        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);

        // use FileOutputStream to define and name the file with ending ".ser"

        try {
            // create a file output stream to write to userInfo.ser File
            FileOutputStream  fileOutputStream = new FileOutputStream("userInfo.ser");

            // use objectOutputStream to write an object to stream
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // use writeObject() method taking an object as argument
            objectOutputStream.writeObject(user);

            objectOutputStream.close();

            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Can not find the file !");
        } catch (IOException e) {
            throw new RuntimeException("Can not output the file!");
        }


    }
}