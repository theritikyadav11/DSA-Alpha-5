import java.util.*;
public class Basic{
    public static void main(String args[]){
        //Arraylist creation
        ArrayList<Integer> list=new ArrayList<>();
        //--------operation----------
        //add
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Add operation in Arraylist "+list);
        //get
        System.out.println("Get 0th element "+list.get(0));
        System.out.println("Get 1st element "+list.get(1));
        System.out.println("Get 2nd element "+list.get(2));
        //remove
        list.remove(0);
        System.out.println("Removing 0th element "+list);
        list.remove(1);
        System.out.println("Removing 1st element "+list);
        //set
        list.set(0,5);
        System.out.println("Set 5 at 0th index");
        list.set(1,6);
        System.out.println("Set 6 at 0th index");
        list.set(2,7);
        System.out.println("Set 7 at 0th index");
        //contains
        System.out.println("is 1 present in arraylist "+list.contains(1));
        System.out.println("is 6 present in arraylist "+list.contains(1));
        System.out.println("is 8 present in arraylist "+list.contains(1));
    }
}