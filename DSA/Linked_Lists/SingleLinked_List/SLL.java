package DSA.Linked_Lists.SingleLinked_List;

public class SLL {
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

    public SLL() {
        this.size = 0;
    }

    public void insertFirst(int v) {
        Node node = new Node(v);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;;
        }

        size += 1;
    }

    public void insertLast(int val) {
        if(tail == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAnywhere(int val, int index) {
        if(index == 0) {
            insertFirst(val);
            return;
        }

        if(index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i=1; i<index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public void removeFirst() {
        int val = head.value;
        head = head.next;
        if(head == tail) {
            tail = null;
        }
        --size;
        System.out.println("Removed node is " + val);
    }


    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("End");
    }

    public void removeDuplicates() {
        Node node = head;
        while(node.next != null) {
            if(node.value == node.next.value) {
                node.next = node.next.next;
            }
            else {
                node = node.next;
            }
            size--;
        }
    }

    public static SLL merge_and_sort(SLL LL1, SLL LL2) {
        Node n1 = LL1.head;
        Node n2 = LL2.head;

        SLL ans = new SLL();

        while(n1 != null && n2 != null) {
            if(n1.value > n2.value) {
                ans.insertLast(n1.value);
                n1 = n1.next;
            }
            else {
                ans.insertLast(n2.value);
                n2 = n2.next;
            }
        }

        while(n1 != null) {
            ans.insertLast(n1.value);
            n1 = n1.next;
        }

        while(n2 != null) {
            ans.insertLast(n2.value);
            n2 = n2.next;
        }
        return ans;
    }
}
