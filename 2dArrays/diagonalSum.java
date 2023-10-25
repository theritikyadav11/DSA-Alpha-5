public class diagonalSum{
    public static void diagonalSum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                //primary diagonal
                if(i==j){
                    sum+=arr[i][j];
                }
                else if(i+j==arr.length-1){
                    //seconday diagonal
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("Total diagonal sum = "+sum);
    }
    //optimized diagonal sum
    public static void diagonalSum2(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            //primary diagonal
            sum+=arr[i][i];
            //secondary diagonal
            if(i!=arr.length-1-i){
                sum+=arr[i][arr.length-i-1];
            }
        }
        System.out.println("Optimized diagonal sum = "+sum);
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        diagonalSum2(arr);
    }
}