package OOPs.OOPs_05.Abstract;

public class Son extends Parents {
    public Son() {
        super(22070797);
    }

    @Override
    void career(String career) {
        System.out.println("I want to become " + career);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name + " and her age is " + age);
    }
}
