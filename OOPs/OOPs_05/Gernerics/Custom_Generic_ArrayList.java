package OOPs.OOPs_05.Gernerics;

// here <Integer> is called generics

/*
    https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects

    Restriction on Generics -->

  Cannot Instantiate Generic Types with Primitive Types
  Cannot Create Instances of Type Parameters
  Cannot Declare Static Fields Whose Types are Type Parameters
  Cannot Use Casts or instanceof With Parameterized Types
  Cannot Create Arrays of Parameterized Types
  Cannot Create, Catch, or Throw Objects of Parameterized Types
  Cannot Overload a Method Where the Formal Parameter Types of Each Overload Erase to the Same Raw Type
*/

public class Custom_Generic_ArrayList<T> {      // using template
    // <T extends Number> is used to access numbers only like int, double, float etc.
    // The 'T' can be replaced with any reference type when the class is instantiated.
    private Object[] data;      // important
    // The use of Object[] allows the Custom_Generic_ArrayList class to store elements of any type.
    // This is necessary because Java does not support creating arrays of generic types directly
    // (i.e., you cannot create an array of 'T' directly when 'T' is a generic type).
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public Custom_Generic_ArrayList() {
        data = new Object[DEFAULT_SIZE];        // important
    }

    public void add(T num) {
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for(int i=0; i<data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T r = (T)(data[--size]);
        // To convert the Object type element retrieved from the data array back to the generic type T, an explicit cast is needed.
        data[size] = null;
        return r;
    }

    public void get(int index) {
        System.out.println(data[index]);
    }

    public void set(int index, T value) {
        data[index] = value;
        display();
    }

    public void display() {
        for (Object d : data) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    public void size() {
        System.out.println(size);
    }


    public static void main(String[] args) {
        Custom_Generic_ArrayList<Integer> list = new Custom_Generic_ArrayList<Integer>();
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


        Custom_Generic_ArrayList<String> list1 = new Custom_Generic_ArrayList<String>();
        list1.add("abc");
        list1.add("def");
        list1.add("hij");
        list1.add("abc");
        list1.add("def");
        list1.add("hij");
        list1.add("abc");
        list1.add("def");
        list1.add("hij");
        list1.add("abc");
        list1.add("def");
        list1.add("hij");
        list1.display();
        list1.get(11);
        list1.set(11, "Tejas");
        String r = list1.remove();
        System.out.println(r);
        list1.display();
        list1.size();
    }
}
