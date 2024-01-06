import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class prog8 {
    
    public static void main(String[] args){
       // File fil=new File("C:\\Users\\kkart\\Desktop\\copied.txt");
       
     try( FileReader fr=new FileReader("C:\\Users\\kkart\\Desktop\\timepass.txt");
     BufferedReader brr=new BufferedReader(fr);
     FileWriter fwi=new FileWriter("C:\\Users\\kkart\\Desktop\\copied.txt");){
    String line="";
    int i=1;
    while((line=brr.readLine())!=null){
            System.out.println(line);
            fwi.append(i+"."+line+"\n");
        i+=1;
    }
     }
     
     catch(IOException io){
          System.out.println("An error occured");
     }

    }
}
