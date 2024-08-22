package DSA.Linked_Lists.Doubly_Linked_List;

public class DLL {

    private static class Node {
        int value;
        Node next;
        Node prev;

        public Node(int val) {
            this.value = val;
        }

        public Node(int val, Node next, Node prev) {
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node head;
    private int size;

    public DLL() {
        size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }     // if head is null then the head.prev will be what. Its totally wrong therefore we are checking this condition
        head = node;
    }

    public void insertLast(int val) {
        Node last = head;
        Node node = new Node(val);

        while(last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.next = null;
        node.prev = last;
    }

    public void display() {
        Node temp = head;
        Node last = null;
        System.out.print(null + " <- ");
        while(temp != null) {
            System.out.print(temp.value + " <--> ");
            last = temp;
            temp = temp.next;
        }
        System.out.print("end \n");

        System.out.println("Reverse -->");
        while(last != null) {
            System.out.print(last.value + " ");
            last = last.prev;
        }
    }
}
