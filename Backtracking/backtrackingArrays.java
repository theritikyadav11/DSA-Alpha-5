public class backtrackingArrays{
    public static void backtrackingArrays(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            printArr(arr);
            return;
        }
        //kaam
        arr[i]=val;
        backtrackingArrays(arr,i+1,val+1);//recursion steps
        arr[i]=arr[i]-2;//backtracking steps
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        backtrackingArrays(arr,0,1);
        printArr(arr);
    }
}