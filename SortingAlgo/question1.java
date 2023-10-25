public class question1{
    public static void bubbleSort(int arr[]){ //Descending order
        for(int i=0;i<arr.length-2;i++){
            int flag=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
    }
     public static void selectionSort(int arr[]){  //Descending order
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
     public static void insertionSort(int arr[]){   //Descending order
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
    public static void countingSort(int arr[]){ //Descending order
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
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        bubbleSort(arr);
        System.out.print("Bubble sort:- ");
        printArr(arr);
        selectionSort(arr);
         System.out.print("Selection sort:- ");
        printArr(arr);
        insertionSort(arr);
         System.out.print("Insertion sort:- ");
        printArr(arr);
        countingSort(arr);
         System.out.print("Counting sort:- ");
        printArr(arr);


    }
}