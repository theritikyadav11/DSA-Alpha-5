import java.util.*;

public class inbuiltSort{
    public static void printArr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Integer arr[]={5,1,6,2,4,3};
        Arrays.sort(arr); //ascending order;
        printArr(arr);
        Arrays.sort(arr,Collections.reverseOrder());//desscending order
       
        printArr(arr);
    }
}//Note In inbuilt sort ascending works on primitive and non-primitive datatype but 
// In Descending order we have to take only primitive datatype otherwise it wouldn't work.