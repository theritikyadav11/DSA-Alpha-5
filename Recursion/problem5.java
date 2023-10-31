public class problem5{
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        //base case
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        //kaam
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1,helper,src,dest);
    }
    public static void main(String args[]){
        int n=3;
        towerOfHanoi(n,"S","H","D");
    }
}