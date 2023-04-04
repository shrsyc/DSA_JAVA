package Linked_List.single_LL;

public class delNode {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void delMiddle(int index) {
        Node curr = head;
        int i = 0;
        while (i < index - 1) {
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;
    }
    public static int deleteFirst() {
        if (head == null) {
            System.out.println("linked list is already null");
            return -1;
        } else if (head == tail) {
            int a = head.data;
            head = tail = null;
            return a;
        }
        int a = head.data;
        Node temp = head;
        temp = head.next;
        head = temp;
        return a;

    }

    public static int deleteLast() {
        Node temp1, temp2;
        if (head == null) {
            System.out.println("linked list is already null");
            return -1;
        } else {
            temp1 = head;
            temp2 = head;
            while (temp1 != null) {
                temp1 = temp1.next;
                if (temp1.next == null) {
                    int c = temp1.data;
                    temp2.next = null;
                    return c;
                } else {
                    temp2 = temp1;
                }
            }
        }
        return 1;

    }

    public static void main(String[] args) {
            

    }
}
