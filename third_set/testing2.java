import java.util.*;
import java.io.*;
public class testing2 {
    public static void main(String[] args) {
        try(FileWriter fwi=new FileWriter("C:\\Users\\kkart\\Desktop\\timepass.txt");
        BufferedWriter bwi=new BufferedWriter(fwi)){
                
        }catch(IOException io){
            System.out.println("An error occured");
        }
    }
}
