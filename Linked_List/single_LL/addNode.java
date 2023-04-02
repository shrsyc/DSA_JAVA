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


    public void addLast(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }


    public void addMiddle(int index , int data){
        Node newnode = new Node(data);
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }

        newnode.next=temp.next;
        temp.next=newnode;

    }


    public void printLL(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        addNode a = new addNode();
        a.addFirst(1);
        a.addFirst(2);
        a.addLast(0);
        a.addFirst(3);
        a.addMiddle(2, 8);
        a.printLL();
    }
    
}