package OOPs.OOPS_03.Inheritance.Hierarchical;

public class B extends A{
    int age;

    public B() {
        this.age = -1;
    }

    public B(int a, String n) {
        super(n);
        this.age = a;
    }
}
