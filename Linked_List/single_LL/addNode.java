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

    public static void addFirst(int data){     
        Node newnode = new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }


    public static void addLast(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }


    public static void addMiddle(int index , int data){
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


    public static  void printLL(){
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

    public static  void delMiddle(int index){
        Node curr=head;
        int i=0;
        while(i<index-1){
            curr=curr.next;
            i++;
        }
        curr.next=curr.next.next;
    }

    public static void main(String[] args) {
        //addNode a = new addNode();
        addFirst(1);
        addFirst(2);
        addLast(0);
        addFirst(3);
        addMiddle(2, 8);
        delMiddle(2);
        printLL();
    }
    
}