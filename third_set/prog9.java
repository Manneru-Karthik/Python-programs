import java.util.*;
import java.io.*;
public class prog9 {
    public static void main(String[] args) {
        List<String> lii=new ArrayList<>();
        try(FileReader fr=new FileReader("C:\\Users\\kkart\\Desktop\\timepass.txt");
        BufferedReader brr=new BufferedReader(fr);
        FileWriter fwi=new FileWriter("C:\\Users\\kkart\\Desktop\\copied3.txt")){
            String line="";
            while((line=brr.readLine())!=null){
                 lii.add(line);
                 
            }
        for(int j=lii.size()-1;j>=0;j--){
            fwi.append(lii.get(j)+"\n");
        }
        }catch(IOException io){
            System.out.println("An error occured");
        }
    }
}
