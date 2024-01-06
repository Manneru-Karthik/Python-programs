import java.util.*;
import java.io.*;
public class prog10 {
    public static void main(String[] args) throws Exception{
    Scanner sc=new Scanner(new File("C:\\Users\\kkart\\Desktop\\CSV.csv"));
     sc.useDelimiter(",");
     while(sc.hasNext()){
        System.out.print(sc.next()+" ");
     }
    }
    }

