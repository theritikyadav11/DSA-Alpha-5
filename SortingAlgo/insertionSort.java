public class insertionSort{
    public static void insertionSort1(int arr[]){   //Ascending order
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];  //temp memory for sorted part
            int prev=i-1;
            //finding out the correct position to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }
    public static void insertionSort2(int arr[]){   //Descending order
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];  //temp memory for sorted part
            int prev=i-1;
            //finding out the correct position to insert
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }
     public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,1,6,2,4,3};
        insertionSort2(arr);
        printArr(arr);
    }
}