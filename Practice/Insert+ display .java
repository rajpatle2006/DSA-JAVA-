class A {
    static class Node {
        int data; Node next;
        Node(int d) { data = d; }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        for (Node t = head; t != null; t = t.next)
            System.out.print(t.data + " ");
    }
}