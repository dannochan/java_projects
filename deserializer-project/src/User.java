import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

   private String name;

    private String password;
    //private transient password; using transient to stop tranport certain data

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void sayHello(){
        System.out.println("User " + this.name + " says Hello ");
    }
}
