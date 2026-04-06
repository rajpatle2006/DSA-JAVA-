package Practice.LInk_list;

// class Node{
//     int data ;
//     Node data ;
//     public Node(int data){
//         this.data=data;
//         this.next=null;

//     }

// }
// class Mylinklist {
//     Node head;
//     void insertAtBegining(int data){
//              Node newNode=new Node(data);


//     }
    
// }
// Node class
class Node {
    int data;       // data part
    Node next;      // reference to next node

    // Constructor
    Node(int d) {
        data = d;
        next = null;
    }
}

// LinkedList class
class LinkedList {
    Node head;   // starting node

    // Function to add new node at end
    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;   // first node
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;  // attach at end
        }
    }

    // Function to display linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add nodes
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);

        // Display list
        list.display();
    }
}