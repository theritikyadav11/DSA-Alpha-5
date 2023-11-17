public class CircularLL {
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
    public static int size = 0;

    // add operation
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public static void addMid(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node prev = head;
        int i = 0;
        while (i < idx - 1) {
            prev = prev.next;
            i++;
        }
        newNode.next = prev.next;
        prev.next = newNode;
        size++;
    }

    // print operation
    public static void print() {
        Node temp = head;
        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("null");
    }
    
    //remove operation
    public static int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
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
   public static int removeLast() {
    if (size == 0) {
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
    } else if (size == 1) {
        int val = head.data;
        head = tail = null;
        size--;
        return val;
    }

    Node prev = head;
    for (int i = 0; i < size - 1; i++) {
        prev = prev.next;
    }

    int val = prev.next.data;
    prev.next = head;
    size--;
    tail = prev; // Move this line outside the loop
    return val;
}


    public static void main(String args[]) {
        CircularLL cll = new CircularLL();
        cll.addFirst(1);
        cll.addLast(2);
        cll.addLast(3);
        cll.addMid(2, 4);
        cll.print();
        cll.removeFirst();
        cll.print();
        cll.removeLast();
        cll.print();
    }
}
