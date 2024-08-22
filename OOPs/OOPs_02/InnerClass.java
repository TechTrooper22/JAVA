package OOPs.OOPs_02;

public class InnerClass {

     static class Test {
        //  static class 'Test' is independent of class objects of class InnerClass
        String name1;
        static String name2;
        public Test(String s) {
            this.name1 = s;
            Test.name2 = s;
            System.out.println(name1);
        }
    }       // Inner class 'test' must be 'static' otherwise line no. 11 & 12 will sow an error.

    public static void main(String[] args) {
        Test a = new Test("Tejas");
        Test b = new Test("Ram");

        System.out.println(a.name1);
        System.out.println(b.name1);

        System.out.println(a.name2);
        System.out.println(b.name2);
        // this is showing warning because we write 'obj.name' instead of 'className.name'
    }

}       // 'static' is not allowed for outer class
