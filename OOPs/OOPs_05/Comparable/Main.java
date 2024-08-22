package OOPs.OOPs_05.Comparable;

import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
        Student tejas = new Student(258, 95.89);
        Student uday = new Student(260, 89.95);

        if(tejas.compareTo(uday) < 0) {
            System.out.println("Uday has more marks");
        }
        else {
            System.out.println("Tejas has more marks;");
        }

        Student[] list = {tejas, uday};
        System.out.println(Arrays.toString(list));
    }


}
