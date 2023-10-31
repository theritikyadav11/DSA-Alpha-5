public class problem1{
    public static void printAllOccurence(int arr[],int key,int i){
        //base case
        if(i==arr.length){
            return;
        }
        //kaam
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        printAllOccurence(arr,key,i+1);
    }
    public static void main(String args[]){
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        printAllOccurence(arr,key,0);
    }
}