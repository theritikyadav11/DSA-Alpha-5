import java.util.*;
public class question1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your words/characters");
        String input=sc.nextLine();
        int count=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("Total number of vowels in"+input+" is:-"+count);
    }
}