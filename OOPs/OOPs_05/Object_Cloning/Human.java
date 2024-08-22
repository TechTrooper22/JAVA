package OOPs.OOPs_05.Object_Cloning;

/*
    Implementing the 'Cloneable' interface in Java is necessary to enable the use of the 'clone()' method for creating a copy of an object.
    Without implementing this interface, calling the clone() method on an object will result in a 'CloneNotSupportedException'.
    The Cloneable interface is a marker interface, which means it does not contain any methods but indicates to the Java runtime that the class is eligible for field-by-field copying.
*/

public class Human implements Cloneable {
    int age;
    String name;

//    public Human(Human o) {
//        this.age = o.age;
//        this.name = o.name;
//    }  Copy Constructor

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();       // shadow cloning
    }
}
// get the info for deep cloning