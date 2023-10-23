public class binaryS{
    public static int binarySearch(int arr[],int key){//TC=O(logn)
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(key==arr[mid]){
                return mid;
            }
            if(key<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12,14};
        int key=10;
        int index=binarySearch(arr,key);
        if(index==-1){
            System.out.println("Key not found");
        }else{
            System.out.println("Key found at index "+index);
        }
    }
}