public class checkPow{
    public static boolean isPowOf2(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String args[]){
        int n=16;
        System.out.println(isPowOf2(n));
    }
}