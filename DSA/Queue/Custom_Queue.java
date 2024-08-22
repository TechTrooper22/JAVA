package DSA.Queue;

public class Custom_Queue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public Custom_Queue() {
        this(DEFAULT_SIZE);
    }

    public Custom_Queue(int size) {
        data = new int[size];
    }

    public void enqueue(int ele) throws Exception {
        if(this.isFull()) {
            throw new Exception("Queue is full");
        }
        data[end++] = ele;
    }

    public void dequeue() throws Exception {
        if(this.isEmpty()) {
            throw new Exception("Unable to perform Dequeue. Queue is empty");
        }
        System.out.println("Popped element is " + data[0]);
        for(int i=1; i<end; i++) {
            data[i-1] = data[i];
        }
        --end;
    }

    public void display() throws Exception {
        if(this.isEmpty()) {
            throw new Exception("Unable to display. Queue is empty");
        }
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " --> ");
        }
        System.out.println("End");
    }


    public int front() {
        return data[0];
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean isFull() {
        return end == data.length;
    }


    public static void main(String[] args) throws Exception {
        Custom_Queue q = new Custom_Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.display();

        q.dequeue();
        q.display();

        q.dequeue();
        q.display();

        System.out.println("Front : " + q.front());
    }
}
