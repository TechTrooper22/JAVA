package OOPs.OOPs_05.Abstract;

public class Daughter extends Parents {
    public Daughter() {
        super(22070797);
    }

    @Override
    void career(String career) {
        System.out.println("I want to become " + career);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name + " and his age is " + age);
    }
}
