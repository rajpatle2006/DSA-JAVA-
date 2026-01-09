class B {
    static class Node {
        int data; Node next;
        Node(int d) { data = d; }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node n = new Node(5);
        n.next = head;
        head = n;

        System.out.print(head.data);
    }
}