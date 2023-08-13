package Learningstringconcepts;
import java.util.*;
public class HTMLTagDecode {

    
    public static String Check(String s){
        int tol=s.length();
        String first=" ";
        String last=" ";
        String result=" ";
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='>'){
            first=s.substring(0,i+1);
            }
            
        }
            int f1=first.length();
            int len=first.length()+1;
            last=s.substring((tol-len),tol);
            int l1=s.length()-last.length();
            last=last.replaceAll("/","");
            last=last.trim();
            
            
            if(first.equals(last)){
                result=s.substring(f1,l1);
                System.out.println(result);
                return result;
            }else{
                System.out.println("None");
                return "None";
            }
           
    }
    
    
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the how many test case");
        int num=in.nextInt();
        in.nextLine();
        System.out.println("Enter the HTML tags");
        for(int i=0;i<num;i++){
            String s1=in.nextLine();
           Check(s1);
            
        }
    }
}



