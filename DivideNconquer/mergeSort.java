public class mergeSort{   //TC=O(nlogn)  SC=O(n)
    public static void merge(int arr[],int si,int ei,int mid){
        int temp[]=new int[ei-si+1];
        int i=si;//iterator for left part
        int j=mid+1;//iterator for right part
        int k=0;//iterator for temp array
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){   //for descending=arr[i]>arr[j];
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //loop for remaining part in left
        while(i<=mid){
            temp[k]=arr[i];
            k++;
            i++;
        }
        //loop for remaining part in right
        while(j<=ei){
            temp[k]=arr[j];
            k++;
            j++;
        }
        //coping temp arr in original array
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr,si,mid);//sorting left part
        mergeSort(arr,mid+1,ei);//sorting right part
        merge(arr,si,ei,mid);
    }
    public static void main(String args[]){
        int arr[]={3,2,4,6,3,2,6,4,4,8};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
}