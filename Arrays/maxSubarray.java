public class maxSubarray{
    //brute force TC=O(n^3) SC=O(1)
    public static void maxSubarraySum1(int arr[]){
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                sum=0;
                for(int k=start;k<=end;k++){
                    sum+=arr[k];
                }
                System.out.println(sum);
                if(maxSum<sum){
                    maxSum=sum;
                }
            }
           
        }
        System.out.println("Max Subarray sum is= "+maxSum);
    }
    //prefix sum TC=O(n2) sc=O(n)
   public static void maxSubarraySum2(int arr[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[arr.length];
    prefix[0] = arr[0];
    
    // Calculating prefix array
    for (int i = 1; i < prefix.length; i++) {
        prefix[i] = prefix[i - 1] + arr[i];
    }
    
    for (int i = 0; i < arr.length; i++) {
        int start = i;
        for (int j = i; j < arr.length; j++) {
            int end = j;
            if (start == 0) {
                currSum = prefix[end];
            } else {
                currSum = prefix[end] - prefix[start - 1];
            }
            if (maxSum < currSum) {
                maxSum = currSum;
            }
        }
    }
    System.out.println("Max subarray sum = " + maxSum);
}

    //kadane's algorithm TC=O(n) SC=O(1)
    public static void maxSubarraySum3(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currSum=currSum+arr[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);
        }
        System.out.println("Max subarray sum is = "+maxSum);
    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        maxSubarraySum2(arr);

    }
}