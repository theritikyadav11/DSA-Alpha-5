import java.util.*;
public class countingSort{
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    public static void countingSort1(int arr[]){ //Ascending order
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int count[]=new int[largest+1];// It stores frequency
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //Sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }

    }
    public static void countingSort2(int arr[]){ //Descending order
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int count[]=new int[largest+1];// It stores frequency
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //Sorting
        int j=arr.length-1;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j--;
                count[i]--;
            }
        }

    }
    public static void main(String args[]){
        int arr[]={4,2,2,6,7,1,4,5,1,2,7,3,5};
        countingSort2(arr);
        printArr(arr);
    }
}