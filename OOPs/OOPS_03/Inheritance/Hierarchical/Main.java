package OOPs.OOPS_03.Inheritance.Hierarchical;

public class Main {
    public static void main(String[] args) {
        Hierarchical.B b = new Hierarchical.B(21, "Tejas");
        System.out.println(b.age + ", " + b.name);

        Hierarchical.C c = new Hierarchical.C(57, "Ram");
        System.out.println(c.rollNo + ", " + c.name);
    }
}
