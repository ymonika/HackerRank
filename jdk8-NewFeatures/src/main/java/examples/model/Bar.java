package examples.model;

public class Bar {

    Foo foo;

    /*public Bar(Foo foo) {
        this.foo = foo;
    }*/

    public Bar() {
    }

    public Foo getFoo() {
        return foo;
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
    }

    @Override
    public String toString() {
        return "Bar{" +
                "foo=" + foo +
                '}';
    }
}
