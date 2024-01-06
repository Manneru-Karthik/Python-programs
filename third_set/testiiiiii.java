import java.util.*;
public class testiiiiii {
    public static void main(String[] args) {
        List<String> li=new ArrayList<>();
        li.add("Java");
        li.add("Python");
        li.add("C");
        li.add("C++");
        for(int i=li.size()-1;i>=0;i--){
            System.out.println(li.get(i));
        }
    }
}
