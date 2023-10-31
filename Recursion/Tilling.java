public class Tilling{
    public static int tillingProblem(int n){
        if(n==0 || n==1){
        return n;
        }
        //kaam
        //vertical
        int fnm1=tillingProblem(n-1);
        //horizontal
        int fnm2=tillingProblem(n-2);
        int totWays=fnm1+fnm2;
        return totWays;
    }
    public static void main(String args[]){
        int n=30;
        System.out.println(tillingProblem(n));
    }
}