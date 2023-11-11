import java.util.*;
public class Question3{
    public static int mostFrequentNo(ArrayList<Integer> nums,int target){
        int ans=0;
        //creating freq[] array
        int freq[]=new int[1001];
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)==target){
                int key=nums.get(i+1);
                freq[key]++;
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<freq.length;i++){
            if(max<freq[i]){
                max=freq[i];
                ans=i;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        int target=2;
        System.out.println(mostFrequentNo(nums,target));
    }
}