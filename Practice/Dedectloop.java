class N {
    static class Node {
        int data; Node next;
        Node(int d){ data=d; }
    }
    public static void main(String[] args) {
        Node h=new Node(1);
        h.next=new Node(2);
        h.next.next=h; // loop

        Node s=h,f=h;
        boolean loop=false;

        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){ loop=true; break; }
        }
        System.out.print(loop);
    }
}