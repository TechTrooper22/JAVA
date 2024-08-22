package OOPs.OOPs_02;

public class StaticBlock {
    static int a = 5;
    static int b;

    // declaring static block
    static {
        System.out.println("I am in StaticBlock");
        b = a * 4;
    }   // only run once when the first object is created or the class is loaded for the first time

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println("a:" + StaticBlock.a + ", b:" + StaticBlock.b);

        StaticBlock.b += 10;
        System.out.println("a:" + StaticBlock.a + ", b:" + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println("a:" + StaticBlock.a + ", b:" + StaticBlock.b);
    }
}
