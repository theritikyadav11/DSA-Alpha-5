public class question8{
    public static void main(String args[]){
        int n=5;
        int digit=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(digit+" ");
                digit++;
            }
            System.out.println();
        }
    }
}