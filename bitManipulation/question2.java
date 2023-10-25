public class question2{
    public static void swap(int num1,int num2){
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.println("After swap "+num1+" "+num2);
      
    }
    public static void main(String args[]){
        int num1=5;
        int num2=3;
        System.out.println("Before swap "+num1+" "+num2);
        swap(num1,num2);
    }
}