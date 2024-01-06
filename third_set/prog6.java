import java.util.regex.*;
public class prog6 {
    public static void main(String[] args){
        
        String str="Hii my email is datastruct@gmail.com"+" "+"cse has email cse@gmail.com";
        String strPattern =  "\\S+@\\S+" ;

        Pattern pattern
            = Pattern.compile(strPattern);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    
    }
}
