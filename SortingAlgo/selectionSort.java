public class selectionSort{
    public static void selectionSort1(int arr[]){    //Ascending order
        int min;
        for(int i=0;i<arr.length-1;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public static void selectionSort2(int arr[]){  //Descending order
        int min;
        for(int i=0;i<arr.length-1;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]<arr[j]){
                    min=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
     public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={38,52,9,18,6,62,13};
        selectionSort2(arr);
        printArr(arr);
    }
}