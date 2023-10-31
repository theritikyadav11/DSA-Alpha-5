public class problem3{
    public static void length(String str,int i,int count){
        if(i==str.length()){
            System.out.println(count);
            return;
        }
        count++;
        length(str,i+1,count);
    }
    public static void main(String args[]){
        String str="RitikRaushan";
        int count=0;
        length(str,0,count);
    }
}