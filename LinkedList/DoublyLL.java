public class DoublyLL{
    public static class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //print operation
    public static void print(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"<->");
        temp=temp.next;
    }
    System.out.println("null");
    }
    //add operation
    public static void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            size++;
            return;
        }
        newNode.next=head;
        newNode.prev=null;
        head=newNode;
        size++;
    }
    public static void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            size++;
            return;
        }
        tail.next=newNode;
        newNode.next=null;
        newNode.prev=tail;
        tail=newNode;
        size++;
    }
    public static void addMid(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        newNode.prev=temp;
        temp.next=newNode;
        size++;
    }
    //remove operation
    public static int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            size=0;
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public static int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            size=0;
            return Integer.MIN_VALUE;
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
        size--;
        return val;

    }
    public static void main(String args[]){
        DoublyLL dll=new DoublyLL();
        dll.addFirst(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.print();
        dll.addMid(2,4);
        dll.print();
        dll.removeFirst();
        dll.print();
        dll.removeLast();
        dll.print();
    }
}