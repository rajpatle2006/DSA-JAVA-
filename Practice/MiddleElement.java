package Practice;
class G {
    static class Node {
        int data; Node next;
        Node(int d) { data = d; }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Node s = head, f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        System.out.print(s.data);
    }
}