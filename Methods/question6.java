public class question6{
    public static boolean isPrime(int n){
        boolean isPrime=true;
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return isPrime;
    }
    public static void main(String args[]){
        System.out.println(isPrime(12));
    }
}