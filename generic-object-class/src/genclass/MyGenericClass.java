package genclass;

public class MyGenericClass <Thing> {
    private Thing x;

    public MyGenericClass(Thing i) {
        this.x = i;
    }

    public Thing getValue() {
        return x;
    }
}
