public class question12{
    public static int reverse(int n){
        int rev=0;
        while(n>0){
            int lastDigit=n%10;
            rev=rev*10+lastDigit;
            n=n/10;
        }
        return rev;
    }
    public static boolean isPalindrome(int n){
        //step 1= find reverse
        //step 2= compare it to original value if both are equal return true else false
        int rev=reverse(n);
        if(n==rev){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        System.out.println(isPalindrome(123));
    }
}