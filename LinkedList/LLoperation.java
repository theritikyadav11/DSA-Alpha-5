public class LLoperation{
    public static class LinkedList{
        //class to create a node
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
        public static int size=0;
        //------------------operations of LL----------------------
        //addFirst
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
        public static void addMid(int idx,int val){
            if(idx==0){
                addFirst(val);
                return;
            }
            Node newNode=new Node(val);
            size++;
            Node temp=head;
            int i=0;
            while(i<idx-1){
                temp=temp.next;
                i++;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        //print operation-----------------
        public static void print(){
            if(head==null){
                System.out.println("LL is empty");
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        //remove operation-----------------
        public static int removeFirst(){
            if(size==0){
                int val=Integer.MIN_VALUE;
                System.out.println("LL is empty");
                return val;
            }else if(size==1){
                int val=head.data;
                head=tail=null;
                size--;
                return val;
            }
            int val=head.data;
            head=head.next;
            size--;
            return val;
        }
        public static int removeLast(){
            if(size==0){
                int val=Integer.MIN_VALUE;
                System.out.println("LL is empty");
                return val;
            }else if(size==1){
                int val=head.data;
                head=tail=null;
                size--;
                return val;
            }
            Node prev=head;
            for(int i=0;i<size-2;i++){
                prev=prev.next;
            }
            int val=prev.next.data;
            prev.next=null;
            tail=prev;
            size--;
            return val;
        }
        //search operation-----------------
        public static int itrSearch(int key){
            if(head==null){
                System.out.println("LL is empty");
                return -1;
            }
            Node temp=head;
            int i=0;
            while(temp!=null){
                if(temp.data==key){
                    return i;
                }
                temp=temp.next;
                i++;
            }
            return -1;
        }
        public static int helper(Node head,int key){
            //base case
            if(head==null){
                return -1;
            }
            if(head.data==key){
                return 0;
            }
            //kaam
            int idx=helper(head.next,key);
            if(idx==-1){
                return -1;
            }
            return idx+1;
        }
        public static int recSearch(int key){
          return helper(head,key);
        }
        //---------reverse a LinkedList------------
        public static void reverse(){
            Node prev=null;
            Node curr=tail=head;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;//reverse steps
                prev=curr;//updation steps
                curr=next;//updation steps
            }
            head=prev;
        }
        //----------Find and remove nth node from end
        public static void deleteNthNodeFromEnd(int n){
           calculate size
           int size=0;
           Node temp=head;
           while(temp!=null){
             temp=temp.next;
             size++;
           }
           if(n==size){
            head=head.next;
            return;
           }
           //size-n
           int i=1;
           int iToFind=size-n;
           Node prev=head;
           while(i<iToFind){
             prev=prev.next;
             i++;
           }
           prev.next=prev.next.next;
           return;
        }
    }
     public static void main(String args[]){
            LinkedList ll=new LinkedList();
            ll.addFirst(1);
            ll.addLast(2);
            ll.addLast(3);
            ll.addLast(4);
            ll.addLast(5);
            ll.print();
            ll.reverse();
            ll.print();
            ll.deleteNthNodeFromEnd(3);
            ll.print();

        }
}