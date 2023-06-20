package Linkedlist;

public class DDL {
    private Node head;
    public void insertFirst(int val){
        Node node=new Node(val);
         node.next=head;
         node.prev=null;
         if(head!=null){
         head.prev=node;}
        head=node;
    }
    public void insertLast(int val){
        Node node=new Node(val);
        Node last=head;
        node.next=null;
         if(head==null)
         {
             node.prev=null;
             head=node;
             return;
         }
        while(last.next!=null){
            last=last.next;
        }
        node.prev=last;
       node.next=null;
       last.next=node;
    }
    public void targetval(int after,int val)
    {
        Node prev=get(after);
        if(prev==null)
        {
            System.out.println("Element does not exist");
            return;
        }
        Node node=new Node(val);

        node.next=prev.next;
        prev.next=node;
        node.prev=prev;

        if(node.next!=null){
            node.next.prev=node;
        }

    }
    public Node get(int value)
    {
        Node node=head;
        while(node!=null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }

        return null;
    }
    public void display()
    {
        Node node=head;
       Node last=null;
        while(node!=null){
            System.out.print(node.val+"->");
            last=node;
            node=node.next;
        }
        System.out.println("END");
        System.out.println(" Traverse ");

        while(last!=null)
        {
            System.out.print(last.val+"->");
            last=last.prev;
        }
        System.out.println("End");
    }
    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;

        }

        public Node(int val) {
            this.val = val;
        }
    }
}
