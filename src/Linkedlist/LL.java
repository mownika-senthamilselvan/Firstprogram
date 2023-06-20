package Linkedlist;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }
    public void insertFirst(int val)
    {
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;
        }
        size+=1;
    }
  public void insertEnd(int val)
    {

        if(tail==null)
        {
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
   public void insertMiddle(int val,int index)
    {
        if(index==0)
        {
           insertFirst(val);
           return;
        }
        if(index==size){
            insertEnd(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node=new Node(val,temp.next);
         temp.next=node;

         size++;

    }
    public int  delFirst()
    {
        int value=head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return value;
    }
    public int delLast(){
        if(size<=1){
            return delFirst();
        }
        Node SecondLast=get(size-2);
        int val= tail.val;
        tail=SecondLast;
        tail.next=null;

        return val;
    }
    public Node get(int index)
    {
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public int delmiddle(int index){
        if(index==0){
            return delFirst();
        }
        if(index==size-1){
            return delLast();
        }
        Node prev=get(index-1);
        int val=prev.next.val;
        prev.next=prev.next.next;
        size--;

        return val;

    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }

    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    public void duplicates(){
        Node node=head;
        while(node.next!=null){
          if(node.val==node.next.val){
              node.next=node.next.next;
              size--;
          }
          else {
              node=node.next;
          }
        }
        tail=node;
        node.next=null;
    }
    public static LL merge(LL first, LL second){
        Node f= first.head;
        Node s= second.head;
        LL ans=new LL();
        while(f!=null && s!=null){
            if(f.val<s.val){
                ans.insertEnd(f.val);
                f=f.next;
            }
            else {
                ans.insertEnd(s.val);
                s=s.next;
            }
        }
        while(f!=null){
            ans.insertEnd(f.val);
            f=f.next;

        }
        while(s!=null){
            ans.insertEnd(s.val);
            s=s.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        LL first=new LL();
        LL second=new LL();
        first.insertEnd(1);
        first.insertEnd(2);
        first.insertEnd(4);

        second.insertEnd(1);
        second.insertEnd(3);
        second.insertEnd(4);

        LL ans = LL.merge(first, second);
        ans.display();
    }
}
