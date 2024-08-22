package OOPs.OOPs_05.Object_Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human ajay = new Human(21, "Tejas");
//        Human atul = new Human(ajay);     this required more time since we are creating new human

        Human atul = (Human) ajay.clone();
        System.out.println(atul.age + " " + atul.name);
    }
}
