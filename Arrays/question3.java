import java.util.*;
public class question3{
     public static int buyAndSellStocks(int prices[]){
        int maxProfit=0;
        int buyPrice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(profit,maxProfit);
            }
            else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[]={7,6,4,3,1};
        System.out.println("Max profit = "+buyAndSellStocks(prices));
        
    }
}