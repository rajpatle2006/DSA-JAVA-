class C {
    static class Node {
        int data; Node next;
        Node(int d) { data = d; }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);

        head = head.next;   // delete first

        System.out.print(head.data);
    }
}