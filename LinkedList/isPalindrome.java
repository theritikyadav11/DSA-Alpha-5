public class isPalindrome{
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
     public static int size;
      public static void addFirst(int data){
            Node newNode=new Node(data);
            size++;
            if(head==null){
                head=tail=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static void addLast(int data){
            Node newNode=new Node(data);
            size++;
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        //----------find mid----(slow fast approach)
        public static Node findMid(Node head){
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
        //-------is Palindrome----------
        public static boolean isPalindrome(){
            if(head==null && head.next==null){
                return true;
            }
            //step1=find mid
            //step2=reverse 2nd half
            //step3=compare 1st half and 2nd half

            Node mid=findMid(head);//1st step
            Node prev=null;//2nd step
            Node curr=mid;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }

            //3rd step
            Node left=head;
            Node right=prev;
            while(right!=null){
                if(left.data!=right.data){
                    return false;
                }
                left=left.next;
                right=right.next;
            }
            return true;

        }
   }
   public static void main(String args[]){
    LinkedList ll=new LinkedList();
    ll.addFirst(1);
    ll.addLast(2);
    ll.addLast(2);
    ll.addLast(1);
    System.out.println(ll.isPalindrome());
   }

}