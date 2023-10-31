public class problem2{
    static String digits[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    public static void printDigits(int num){
        //base case
        if(num == 0){
            return;
        }
        int lastDigit=num%10;
        printDigits(num/10);
        System.out.print(digits[lastDigit]+" ");
    }
    public static void main(String args[]){
        int num=2023;
        printDigits(num);

    }
}