public class isCycle{
   public static class LinkedList{
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
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
   }

    public static void main(String args[]){
        LinkedList ll=new LinkedList();
        ll.head=new ll.Node(1);
        Node temp=new ll.Node(2);
        ll.head.next=temp;
        ll.head.next.next=new ll.Node(3);
        ll.head.next.next.next=temp;
        System.out.println(ll.isCycle());
    }
}