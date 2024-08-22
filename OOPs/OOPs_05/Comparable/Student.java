package OOPs.OOPs_05.Comparable;

/*
    By implementing Comparable, you gain:
        Natural Ordering: Define how objects should be ordered by default.
        Simplified Sorting: Easily sort collections of objects.
        Consistency: Maintain a consistent ordering logic throughout your application.
        Integration: Seamlessly integrate with Java’s collection classes and algorithms.
        Encapsulation: Keep comparison logic within the class, making it intuitive and maintainable.

    When a class implements 'Comparable', it must override the 'compareTo' method, which compares the current object with another object of the same type.
    It is a interface
*/
public class Student implements Comparable<Student>{
    int rollNo;
    double marks;

    public Student(int rn, double m) {
        this.rollNo = rn;
        this.marks = m;
    }

    // Right click of the mouse --> Generate
    @Override
    public String toString() {
        return rollNo + " " + marks;
    }

    @Override
    public int compareTo(Student o) {
        return ((int) (this.marks - o.marks));
        // if difference = 0 --> marks are same
        // if difference < 0 --> o.marks are more
        // if difference > 0 --> o.marks are less

        // to sort in descending order --> return -((int) (this.marks - o.marks));
    }
}
