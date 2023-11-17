public class mergeSort{
    public static Node mergeSort(Node ll.head){
        Node mid=findMid();
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(ll.head);
        NNode newRight=mergeSort(rightHead);
        return merge(newLeft,newRight);
    }
    private Node findMid(){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private Node merge(Node left,Node right){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        while(left!=null && right!=null){
            if(left.data<=right.data){
                temp.next=left;
                left=left.next;
                temp=temp.next;
            }else{
                temp.next=right;
                right=right.next;
                temp=temp.next;
            }
        }
        while(left!=null){
            temp.next=left;
            left=left.next;
            temp=temp.next;
        }
        while(right!=null){
            temp.next=right;
            right=right.next;
            temp=temp.next;
        }
        return mergedLL.next;
    }
    public static void main(String args[]){
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        System.out.println(ll);
        ll.head=ll.mergeSort(ll.head);
        System.out.println(ll);
    }
}