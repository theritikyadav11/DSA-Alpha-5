public class linearSearch{
    public static int linearSearch(int arr[],int key){//TC=O(n)
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12,14,16,18};
        int key=10;
        int index=linearSearch(arr,key);
        if(index==-1){
            System.out.println("Key not found");
        }else{
            System.out.println("Key found at indext "+index);
        }

    }
}