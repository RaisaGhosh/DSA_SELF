package DATASTRUCTURES.LINKEDLIST;

public class DLL {
    
    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node prev,Node next){
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node head;
    int size;

    public DLL(){
        size = 0;
    }

    public void insertFirst(int value){
        Node newNode = new Node(value,null,head);
        
        if(head != null)    head.prev = newNode;

        head = newNode;

        ++size;
    }

    public void insertLast(int value){

        if(head == null){
            insertFirst(value);
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        Node newNode = new Node(value,temp,null);

        temp.next = newNode;
        
        ++size;

    }

    public void display(){
        Node temp = head;
        Node last = null;

        while(temp != null){
            System.out.print(temp.value + "->");
            last = temp;
            temp = temp.next;
        }

        System.out.print("END\n");

        System.out.print("END");

        while(last != null){
            System.out.print("<-" + last.value);
            last = last.prev;
        }

        System.out.println();

    }
}
