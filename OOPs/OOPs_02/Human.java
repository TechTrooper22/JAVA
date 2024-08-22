package OOPs.OOPs_02;

public class Human {
    String name;
    int age;
    boolean married;
    static long population;
    // static variables are object independent, which means only class can access it not the object itself
    // static variables are common to every object of same class

    public Human(String n, int a, boolean m) {
        this.name = n;
        this.age = a;
        this.married = m;
        Human.population += 1;
        // to access or modify static variable, good practise is 'className.staticVariable'
    }

    public void displayInfo() {
        System.out.print(name + ", ");
        System.out.print(age + ", ");
        System.out.print(married + ", ");
        System.out.print(population + "\n");
    }
}

// something which is not static belongs to the object (ex :- 'displayInfo()' belongs to object of class 'Human')


