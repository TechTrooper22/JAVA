package DSA.Queue;

public class Custom_Dynamic_Queue extends Custom_Queue {
    public Custom_Dynamic_Queue() {
        super();
    }

    public Custom_Dynamic_Queue(int size) {
        super(size);
    }

    @Override
    public void enqueue(int ele) throws Exception {
        if(this.isFull()) {
            int[] temp = new int[2 * data.length];
            for(int i=0; i<this.end; i++) {
                temp[i] = this.data[i];
            }
            this.data = temp;
            System.out.println("Updated size is " + data.length);
        }
        super.enqueue(ele);
    }

    public static void main(String[] args) throws Exception {
        Custom_Dynamic_Queue q = new Custom_Dynamic_Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.display();

        q.enqueue(6);
        q.display();

        q.dequeue();
        q.display();

        q.dequeue();
        q.display();

        System.out.println("Front : " + q.front());
    }
}
