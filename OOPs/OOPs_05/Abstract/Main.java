package OOPs.OOPs_05.Abstract;

public class Main {
    public static void main(String[] args) {
        Son susmit = new Son();
        susmit.career("Engineer");
        susmit.partner("Susanchi", 28);

        System.out.println();

        Daughter gunjan = new Daughter();
        gunjan.career("Professor");
        gunjan.partner("Vinay", 26);

        System.out.println();

        Parents gungun = new Daughter();
        // In this improved design, the Parents class has the methods defined, allowing the Daughter class to override them.
        // This way, you can call the methods on the Parents reference without casting.
        gungun.career("Professor");
        gungun.partner("Viraj", 26);
    }
}
