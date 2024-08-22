package OOPs.OOPs_05.Abstract;

public abstract class Parents {
    final int VALUE;
    //  it means that the variable can only be assigned once.

    protected Parents(int value) {
        this.VALUE = value;
    }

    abstract void career(String career);
    abstract void partner(String name, int age);
}   // we can not create abstract constructors & objects of abstract class,
    // but we can create static & normal methods
