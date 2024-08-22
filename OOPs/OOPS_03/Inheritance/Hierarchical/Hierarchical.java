package OOPs.OOPS_03.Inheritance.Hierarchical;

public class Hierarchical {

    public static class A {
        String name;

        public A() {
            this.name = null;
        }

        public A(String n) {
            this.name = n;
        }
    }

    public static class B extends A {
        int age;

        public B() {
            this.age = -1;
        }

        public B(int a, String n) {
            super(n);
            this.age = a;
        }
    }

    public static class C extends A {
        int rollNo;

        public C() {
            this.rollNo = -1;
        }

        public C(int rn, String n) {
            super(n);
            this.rollNo = rn;
        }
    }

    public static void main(String[] args) {
        B b = new B(21, "Tejas");
        System.out.println(b.age + ", " + b.name);

        C c = new C(57, "Ram");
        System.out.println(c.rollNo + ", " + c.name);
    }
}
