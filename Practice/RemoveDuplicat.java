class M {
    static class Node {
        int data; Node next;
        Node(int d){ data=d; }
    }
    public static void main(String[] args) {
        Node h=new Node(1);
        h.next=new Node(1);
        h.next.next=new Node(2);

        for(Node t=h;t.next!=null;)
            if(t.data==t.next.data)
                t.next=t.next.next;
            else t=t.next;

        for(Node n=h;n!=null;n=n.next)
            System.out.print(n.data+" ");
    }
}