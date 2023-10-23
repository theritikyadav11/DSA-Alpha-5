public class question1{
        //Linear approach
    public static boolean isDistinct1(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    //Binary search approach---> This works only when array is sorted
    public static boolean isDistinct2(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+end/2;
            if(arr[start]==arr[end]){
                return true;
            }
            start++;
            end--;

        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        System.out.println(isDistinct2(arr));
    }
}