package OOPs.OOPS_03.Inheritance.Hierarchical;

public class C extends A {
    int rollNo;

    public C() {
        this.rollNo = -1;
    }

    public C(int rn, String n) {
        super(n);
        this.rollNo = rn;
    }
}
