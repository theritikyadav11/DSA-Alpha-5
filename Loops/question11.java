import java.util.*;
public class question11{
    public static void main(String args[]){
        int evenSum=0;
        int oddSum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many number you want to input:- ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("Enter your "+i+"th number:- ");
            int num=sc.nextInt();
            if(num%2==0){
                evenSum+=num;
            }
            else{
                oddSum+=num;
            }
        }
        System.out.println("Even sum = "+evenSum);
        System.out.println("Odd sum = "+oddSum);

    }
}