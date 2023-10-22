import java.util.*;
public class question13{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. which you want to see the table:- ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}