import java.util.*;
import java.util.Scanner;
public class prog2 {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       String str1=sc.next().toLowerCase();
       String str2=sc.next().toLowerCase();
       char[] ch1=str1.toCharArray();
       char[] ch2=str2.toCharArray();
       Arrays.sort(ch1);
       Arrays.sort(ch2);
       if(Arrays.equals(ch1,ch2)){
        System.out.println("Its anagram string");
       }else{
        System.out.println("Its not an a anagram");
       }

    }
}
