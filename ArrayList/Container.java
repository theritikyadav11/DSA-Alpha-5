import java.util.ArrayList;
public class Container{
    public static int mostWater(ArrayList<Integer> height){
        //iterative approach -0(n^2)
        int water=0;
        int maxWater=Integer.MIN_VALUE;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht=Math.min(height.get(i),height.get(j));
                int width=j-i;
                water=ht*width;
                maxWater=Math.max(water,maxWater);
            }
        }
        return maxWater;
    }
    public static int mostWater2(ArrayList<Integer> height){
        //2 pointer approach
        int maxWater=Integer.MIN_VALUE;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            int ht=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int currWater=ht*width;
            maxWater=Math.max(currWater,maxWater);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(mostWater2(height));

    }
}