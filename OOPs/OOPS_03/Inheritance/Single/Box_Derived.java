package OOPs.OOPS_03.Inheritance.Single;

public class Box_Derived extends Box_Base {
    float w;

    public Box_Derived() {
        this.w = -1;
    }

    public Box_Derived(float len, float bre, float hei, float wei) {
        // Call to 'super()' must be first statement in constructor body
        super(len, bre, hei);   // calls the parent class constructor
        this.w = wei;
        System.out.println("It has a weight of " + h + " kg");
    }

    public static void main(String[] args) {
        Box_Base aa = new Box_Base(4.4f);
        Box_Base bb = new Box_Base(1.1f, 2.2f, 3.3f);
        Box_Base cc = new Box_Base(bb);

        Box_Derived bd = new Box_Derived(1.2f, 1.3f, 1.4f, 1.5f);
    }
}
