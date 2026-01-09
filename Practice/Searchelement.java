package Practice;
class D {
    static class Node {
        int data; Node next;
        Node(int d) { data = d; }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);

        int key = 20;
        Node t = head;

        while (t != null && t.data != key)
            t = t.next;

        System.out.print(t != null);
    }
}