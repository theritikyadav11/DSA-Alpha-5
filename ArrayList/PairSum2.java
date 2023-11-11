import java.util.ArrayList;
public class PairSum2{
    // public static boolean pairSum2(ArrayList<Integer> list, int target){
    //     //iterative appraoch 0(n^2)
    //       for(int i=0;i<list.size();i++){
    //         for(int j=i+1;j<list.size();j++){
    //             if(list.get(i)+list.get(j)==target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        // 2 pointer approach
        int pivot=-1;
        int n=list.size();
        //loop for finding pivot point
        for(int i=0;i<list.size();i++){
            if(list.get(i+1)<list.get(i)){
                pivot=i;
                break;
            }
        }
        int lp=pivot+1;
        int rp=pivot;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }else if(list.get(lp)+list.get(rp) < target){
                lp=(lp+1)%n;
            }else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
        System.out.println(pairSum2(list,target));
        
    }
}