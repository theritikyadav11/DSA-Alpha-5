public class quickSort{
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){  //for decending order arr[j]>=pivot
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        //swap
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void quickSort(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        int pidx=partition(arr,si,ei);
        quickSort(arr,si,pidx-1);//sorting left part
        quickSort(arr,pidx+1,ei);//sorting right part

    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={3,2,6,9,4,6,9,1,4,6};
        quickSort(arr,0,arr.length-1);
        printArr(arr);

    }
}