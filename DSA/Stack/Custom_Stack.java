package DSA.Stack;

public class Custom_Stack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int pos = -1;

    public Custom_Stack() {
        this(DEFAULT_SIZE);
    }

    public Custom_Stack(int size) {
        this.data = new int[size];
    }

    public void push(int num) {
        if(this.isFull()) {
            System.out.println("Stack is full");
            return;
        }
        data[++pos] = num;
    }

    public int pop() throws Exception {
        if(this.isEmpty()) {
            throw new Exception("Stack is empty. Nothing to PoP");
        }
        return data[pos--];
    }

    public int peek() throws Exception {
        if(this.isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return data[pos];
    }

    public void display() {
        if (!this.isEmpty()) {
            for (int i = pos; i >= 0; i--) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }

    public boolean isFull() {
        return pos == data.length - 1;
    }

    public boolean isEmpty() {
        return pos == -1;
    }

    public static void main(String[] args) throws Exception {
        Custom_Stack cs = new Custom_Stack(5);

        cs.push(1);
        cs.push(2);
        cs.push(3);
        cs.push(4);
        cs.push(5);
        cs.display();

        int val = cs.pop();
        System.out.println("Popped element is " + val);

        int p = cs.peek();
        System.out.println("Peek element is " + p);
    }
}
