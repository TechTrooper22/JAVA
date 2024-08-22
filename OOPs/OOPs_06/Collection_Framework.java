package OOPs.OOPs_06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collection_Framework {
    enum Week {
           Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
    }

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        List<Integer> v = new Vector<>();
        List<Integer> ll = new LinkedList<>();

        for(Week days : Week.values()) {
            System.out.println(days);
        }
    }
}
