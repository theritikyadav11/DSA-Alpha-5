import java.util.ArrayList;
import java.util.Collections;
public class Sorting{
    public static void main(String args[]){
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(3);
        nums.add(8);
        nums.add(2);
        nums.add(9);
        nums.add(0);
        nums.add(1);
        nums.add(2);
        nums.add(4);
        //sorting in ascending order
        Collections.sort(nums);
        System.out.println("In ascending order"+nums);
        //sorting in descending order
        Collections.sort(nums,Collections.reverseOrder());
        System.out.println("In descending order"+nums);
    }
}