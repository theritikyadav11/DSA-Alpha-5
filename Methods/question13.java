public class question13{
    public static int digitSum(int n){
        int sum=0;
        while(n>0){
            int lastDigit=n%10;
            sum=sum+lastDigit;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[]){
        System.out.println(digitSum(1238));
    }
}