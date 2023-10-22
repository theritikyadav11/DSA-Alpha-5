public class question4{
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static int binCoff(int n,int r){
        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_nmr=fact(n-r);
        int ans= fact_n/fact_r * fact_nmr;
        return ans;
    }
    public static void main(String args[]){
        int n=5;
        int r=2;
        
        System.out.println(binCoff(n,r));
    }
}