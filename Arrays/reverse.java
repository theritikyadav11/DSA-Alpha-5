public class reverse{
    public static void reverse(int arr[]){//O(logn) SC=O(1)
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        reverse(arr);
        for(int i=0;i<arr.length;i++){//O(n)
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}