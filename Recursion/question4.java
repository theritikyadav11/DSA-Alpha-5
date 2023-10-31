public class question4{
    public static int calcSum(int n){
        if(n==1){
            return 1;
        }
        int sum=0;
        int nm1=calcSum(n-1);
        sum=n+nm1;
        return sum;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println("sum of first "+n+" natural no. are:- "+calcSum(n));

    }
}