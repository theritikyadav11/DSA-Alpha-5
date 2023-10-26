import java.util.*;
public class question4{
    public static boolean isAnagram(String str1,String str2){
        //convert both string to lowercase so that  we have to not check for both uppercase and lowercase
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        //check if both string size are equals
        if(str1.length()==str2.length()){
            //convert both strings in char array
            char[] charstr1=str1.toCharArray();
            char[] charstr2=str2.toCharArray();
            //sort both strings
            Arrays.sort(charstr1);
            Arrays.sort(charstr2);
            //check if both are equals
            if(Arrays.equals(charstr1,charstr2)){
                System.out.println(str1+" and "+str2+" both are anagrams of each other");
                return true;
            }else{
                System.out.println(str1+" and "+str2+" both are not anagrams of each other");
                return false;
            }
        }else{
            System.out.println(str1+" and "+str2+ " are not anagrams");
            return false;
        }

    }
    public static void main(String args[]){
        String str1="ritik";
        String str2="raushan";
        System.out.println(isAnagram(str1,str2));
    }
}