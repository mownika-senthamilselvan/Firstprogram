package practise;

public class Betweentwosets {
      private Node head;
      private Node tail;
      private int size;

    public Betweentwosets(int size) {
        this.size = 0;
    }
    public void insertval(int val) {
        Node node=new Node(val);
        Node temp;
        temp=head;
        if(head==null){
            head=node;
        }
        else{
            temp.next=node;
            tail=temp.next;
        }
    }
    public void display(int val){
        Node temp;
        temp=head;
        while(temp!=null){
            System.out.println(temp.val + "->");
            temp=temp.next;
        }
        System.out.println("End");
    }
    private class Node {
       int val;
       Node next;

        public Node(int val, Node node) {
            this.val = val;
            this.next= node;
        }

        public Node(int val) {
            this.val = val;
        }
    }

}




         






