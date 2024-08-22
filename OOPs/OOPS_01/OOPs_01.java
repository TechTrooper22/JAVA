package OOPs.OOPS_01;

public class OOPs_01 {
    public static void main(String[] args) {

//        Student s1 = new Student();
//        System.out.println(s1.name);
//        System.out.println(s1.age);
//        System.out.println(s1.rollNo);
//
//        Student s2 = new Student();
//        System.out.println(s2.name);
//        System.out.println(s2.age);
//        System.out.println(s2.rollNo);

//        s.greetings();
//        s.changeName("Ram");
//        s.greetings();

        Student s = new Student("Rahul", 20, 250);
        s.display();

        Student t = new Student(s);
        t.display();

    }

    static class Student {
        int age;
        String name;
        int rollNo;

        Student() {
            this.name = "Tejas";
            this.age = 21;
            this.rollNo = 258;
        }       // Constructor

        Student(String n, int a, int rn) {
            this.name = n;
            this.age = a;
            this.rollNo = rn;
        }       // Parameterized Constructor

        Student(Student other) {
            this.name = other.name;
            this.age = other.age;
            this.rollNo = other.rollNo;
        }       // Copy Constructor

        void display() {
            System.out.println(this.name);
            System.out.println(this.age);
            System.out.println(this.rollNo);
            System.out.println();
        }

        void greetings() {
            System.out.println("Hello! My name is " + name);
        }

        void changeName(String newName) {
            name = newName;
        }
     }
}
