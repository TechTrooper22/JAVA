package DSA.Trees;

import java.util.Scanner;

public class Binary_Tree {

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int val) {
            this.value = val;
        }
    }

    private Node root;

    public void insert(Scanner scan) {
        System.out.print("Enter the root node: ");
        int value = scan.nextInt();
        root = new Node(value);
        insert(scan, root);
    }

    private void insert(Scanner scan, Node node) {
        System.out.print("Do you want to enter to the left of " + node.value + " ? : ");
        boolean left = scan.nextBoolean();
        if(left) {
            System.out.print("Enter the value to the left of " + node.value + ": ");
            int value = scan.nextInt();
            node.left = new Node(value);
            insert(scan, node.left);
        }

        System.out.print("Do you want to enter to the right of " + node.value + " ? : ");
        boolean right = scan.nextBoolean();
        if(right) {
            System.out.print("Enter the value to the right of " + node.value + ": ");
            int value = scan.nextInt();
            node.right = new Node(value);
            insert(scan, node.right);
        }
    }

    public void display() {
        display(root, " ");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println( indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void displayPath() {
        displayPath(root, 0);
    }

    private void displayPath(Node node, int level) {
        if (node == null) {
            return;
        }

        displayPath(node.left, level+1);

        if(level != 0) {
            for(int i=0; i<level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|-------> " + node.value);
        }
        else {
            System.out.println(node.value);
        }

        displayPath(node.right, level+1);
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        preOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        System.out.print(node.value + " ");
        preOrder(node.right);
    }

    public void postOrder() {
        preOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
        Binary_Tree tree = new Binary_Tree();
        Scanner sc = new Scanner(System.in);
        tree.insert(sc);
        System.out.println("\n");
        tree.displayPath();
    }
}