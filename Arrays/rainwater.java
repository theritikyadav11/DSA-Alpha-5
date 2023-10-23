public class rainwater{
    public static int trappedRainWater(int height[]){
        //calculate leftmax boundary
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<leftmax.length;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //calculate rightmax boundary
        int rightmax[]=new int [height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        //loop
        int trappedWater=0;
        for(int i=0;i<height.length;i++){
            //calculating waterlevel
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trappedWater=trappedWater+(waterlevel-height[i]);
        }
        return trappedWater;
    }
    public static void main(String args[]){
        int height[]={4,2,0,3,2,5};
        System.out.println("Total trapped water = "+trappedRainWater(height));
    }
}