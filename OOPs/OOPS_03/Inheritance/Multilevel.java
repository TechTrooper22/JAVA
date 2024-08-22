package OOPs.OOPS_03.Inheritance;

public class Multilevel {

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

    public static class C extends B {
        int rollNo;

        public C() {
            this.rollNo = -1;
        }

        public C(int rn, String n, int a) {
            super(a, n);
            this.rollNo = rn;
        }
    }

    public static void main(String[] args) {

        C c = new C(57, "Ram", 21);
        System.out.println(c.rollNo + ", " + c.name + ", " + c.age);
    }

}
