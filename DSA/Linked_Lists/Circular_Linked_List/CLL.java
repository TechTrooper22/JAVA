package DSA.Linked_Lists.Circular_Linked_List;

public class CLL {
    private static class Node {
        private int value;
        private Node next;

        public Node(int val) {
            this.value = val;
        }

        public Node(int val, Node n) {
            this.value = val;
            this.next = n;
        }
    }

    private Node head;
    private Node tail;

    private int size;

    public CLL() {
        this.size = 0;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node temp = head;
        if(head != null) {
            do {
                System.out.print(temp.value + " --> ");
                temp = temp.next;
            } while(temp != head);
        }
        System.out.println(head.value);
    }
}
