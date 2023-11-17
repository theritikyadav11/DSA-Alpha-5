public class SinglyLL{
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
    //add operation
    public static void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            size++;
            return;
        }
        newNode.next=head;
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
        tail=newNode;
        size++;
    }
    public static void addMid(int idx,int data){
        if(idx==1){
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
        temp.next=newNode;
        size++;
    }
    //print operation
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
    //remove operation
    public static int removeFirst(){
        if(head==null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public static int removeLast(){
        if(head==null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
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
    public static void main(String args[]){
        SinglyLL sll=new SinglyLL();
        sll.addFirst(1);
        sll.addLast(2);
        sll.addLast(3);
        sll.addMid(2,4);
        sll.print();
        sll.removeLast();
        sll.print();
        sll.removeFirst();
        sll.print();
    }
}