public class bubbleSort{
    public static void bubbleSort1(int arr[]){   //Ascending order
        for(int i=0;i<arr.length-1;i++){
            int flag=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
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
    public static void bubbleSort2(int arr[]){    //Descending order
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
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={36,19,29,12,5};
        bubbleSort2(arr);
        printArr(arr);

    }
}