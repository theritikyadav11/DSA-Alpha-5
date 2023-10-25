public class exponention{
    public static int fastExponent(int n,int r){
        int ans=1;
        while(r > 0){
            if((r & 1) !=0){
            ans=ans*n;
            }
            n=n*n;
            r=r>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        int n=2,r=5;
        System.out.println(fastExponent(n,r));
    }
}