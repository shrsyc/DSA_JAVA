package Linked_List.single_LL;

public class delNode {
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
        
        
        delMiddle(2);
        
    }
}
