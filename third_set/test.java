import java.io.*;
public class prog8 {
    public static void main(String[] args){
       // File obj=new File("C:\\Users\\kkart\\Desktop\\timepass.txt");
        try{
        FileWriter fw=new FileWriter("C:\\Users\\kkart\\Desktop\\timepass.txt",true);

       // fw.write("I did it in Java bro");
        fw.append("Now brother got network issue");
        fw.close();
    }
    catch(IOException io){
        System.out.println("An error occured");
    }
}
}
