public class question1{
    public static void main(String args[]){
        int arr[][]={{4,7,8},{8,8,7}};
        int count=0;
        int key=7;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    count++;
                }
            }
        }
        System.out.println("Total number of 7 in this array is:- "+count);

    }
}