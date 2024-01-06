import java.util.*;
public class prog3 {
    public static void main(String[] args) {
   
        String st="Hello world";
         Map<Character,Integer> mp=new HashMap<>();
         for(int i=0;i<st.length();i++){
            if(mp.containsKey(st.charAt(i))){
                mp.put(st.charAt(i),mp.get(st.charAt(i))+1);
              }else{
                            mp.put(st.charAt(i),1);
         }
         }
         for(Map.Entry<Character,Integer> men:mp.entrySet()){
            if(men.getValue()>1){
             System.out.println(men.getKey());

         }
    }
    
    }
}