package OOPs.OOPS_03.Inheritance.Single;

public class Box_Base {
    float l, b, h;

    public Box_Base() {
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

    public Box_Base(float v) {
        this.l = v;
        this.b = v;
        this.h = v;
        System.out.println("It's a cube having side " + l);
    }

    public Box_Base(float len, float bre, float hei) {
        this.l = len;
        this.b = bre;
        this.h = hei;
        System.out.println("It's a cuboid having length, breadth & height i.e. " + l + ", " + b + " & " + h + " resp.");
    }

    public Box_Base(Box_Base B) {
        this.l = B.l;
        this.b = B.b;
        this.h = B.h;
        System.out.println("It's a box-copy having length, breadth & height i.e. " + l + ", " + b + " & " + h + " resp.");
    }
}
