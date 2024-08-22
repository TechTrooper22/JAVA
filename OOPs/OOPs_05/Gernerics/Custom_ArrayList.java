package OOPs.OOPs_05.Gernerics;

import java.util.ArrayList;

public class Custom_ArrayList {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public Custom_ArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        for(int i=0; i<data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public int remove() {
        int r = data[--size];
        data[size] = 0;
        return r;
    }

    public void get(int index) {
        System.out.println(data[index]);
    }

    public void set(int index, int value) {
        data[index] = value;
        display();
    }

    public void display() {
        for (int d : data) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    public void size() {
        System.out.println(size);
    }


    public static void main(String[] args) {
        Custom_ArrayList list = new Custom_ArrayList();
        for(int i=0; i<15; i++) {
            list.add(i);
        }
        list.display();
        list.get(12);
        list.set(12, 22);
        int n = list.remove();
        System.out.println(n);
        list.display();
        list.size();

        ArrayList<Integer> list2 = new ArrayList<>();
        // here <Integer> is called generics

    }
}


