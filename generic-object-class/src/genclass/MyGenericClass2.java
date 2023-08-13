package genclass;

// create a generic with 2 generic parameters

public class MyGenericClass2 <Thing, Thing2 >{
    private Thing thing;
    private Thing2 thing2;

    public MyGenericClass2(Thing thing, Thing2 thing2) {
        this.thing = thing;
        this.thing2 = thing2;
    }

    public Thing getValue1() {
        return thing;
    }

    public Thing2 getValue2() {
        return thing2;
    }
}
