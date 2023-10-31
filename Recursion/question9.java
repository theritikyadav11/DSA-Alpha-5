public class question9{
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int nm1=power(x,n-1);
        int xn=x*nm1;
        return xn;
    }
    public static void main(String args[]){
        int x=2;
        int n=10;
        System.out.println(power(x,n));

    }
}