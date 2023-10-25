public class clearBitsRange{
    public static int clearBitsInRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b= (1<<i) - 1;
        int bitMask=(a | b);
        return (n & bitMask);
    }
    public static void main(String args[]){
        int n=18;
        System.out.println(clearBitsInRange(n,2,1));
    }
}