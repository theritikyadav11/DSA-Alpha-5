public class sortedNrotated{
    public static int search(int arr[],int key,int si,int ei){
        //base case
        if(si>ei){
            return -1;
        }
        //kaam
        int mid=si+(ei-si)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[si]<=arr[mid]){
            //mid on line 1
            //case a: left
            if(arr[si]<=key && key<=arr[mid]){
                return search(arr,key,si,mid-1);
            }else{
                //case b:right
                return search(arr,key,mid+1,ei);
            }

        }else{
            //mid on line 2
            //case c:right
            if(arr[mid]<=key && key<=arr[ei]){
                return search(arr,key,mid+1,ei);
            }else{
                return search(arr,key,si,mid-1);
            }
        }
        
    }
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        int key=0;
        System.out.println(search(arr,key,0,arr.length-1));
    }
}