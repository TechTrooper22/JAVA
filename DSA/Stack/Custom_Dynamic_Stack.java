package DSA.Stack;

public class Custom_Dynamic_Stack extends Custom_Stack {
    public Custom_Dynamic_Stack() {
        super();
    }

    public Custom_Dynamic_Stack(int size) {
        super(size);
    }

    @Override
    public void push(int num) {
        if(this.isFull()) {
            int[] temp = new int[2*(data.length)];

            for(int i=0; i<data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        super.push(num);
    }

    public static void main(String[] args) throws Exception {
        Custom_Dynamic_Stack cs = new Custom_Dynamic_Stack(5);

        cs.push(1);
        cs.push(2);
        cs.push(3);
        cs.push(4);
        cs.push(5);
        cs.push(6);
        cs.push(7);
        cs.push(8);
        cs.push(9);
        cs.push(10);
        cs.push(11);
        cs.push(12);
        cs.push(13);
        cs.push(14);
        cs.push(15);

        cs.display();

        int val = cs.pop();
        System.out.println("Popped element is " + val);

        int p = cs.peek();
        System.out.println("Peek element is " + p);
    }
}
