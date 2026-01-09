package Practice;
class H {
    static class Node {
        int data; Node next;
        Node(int d){ data=d; }
    }
    public static void main(String[] args) {
        Node h=new Node(1);
        h.next=new Node(2);
        h.next.next=new Node(3);

        Node t=h;
        while(t.next.next!=null) t=t.next;
        t.next=null;

        for(Node n=h;n!=null;n=n.next)
            System.out.print(n.data+" ");
    }
}