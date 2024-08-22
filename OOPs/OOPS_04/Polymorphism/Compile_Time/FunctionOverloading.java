package OOPs.OOPS_04.Polymorphism.Compile_Time;

public class FunctionOverloading {
    void area(double r) {
        System.out.println(3.14 * r * r);
    }

    void area(double l, double b) {
        System.out.println(0.5 * l * b);
    }

    public static void main(String[] args) {
        FunctionOverloading f = new FunctionOverloading();
        f.area(5);
        f.area(3, 2);
    }
}
// Function overloading is a compile time polymorphism
