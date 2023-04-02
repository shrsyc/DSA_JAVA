package Linked_List.single_LL;

public class addNode {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    public static void main(String[] args) {
        addNode a = new addNode();
        a.addFirst(1);
        a.addFirst(2);

    }
    
}