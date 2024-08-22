package OOPs.OOPs_02.a;

public class Greetings {
    public static void main(String[] args) {}

    public static void message() {
        System.out.println("Hello! Welcome to the OOPs Package.");
    }       // Using 'public' to make function readable to other classes of different packages.
}


// if we want to access a function from another class which is in the different package (for example 'a' & 'b')
// then we must import the package from which we want to access that function

// if we want to access a function from another class which is in the same package (for example 'Human' & 'Main')
// then we do not need to import the package from which we want to access that function