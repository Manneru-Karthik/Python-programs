import java.util.*;
public class pro4 {
    public static void main(String[] args) {
        String str="Hello world";
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(mp.containsKey(str.charAt(i))){
                mp.put(str.charAt(i),mp.get(str.charAt(i))+1);
            }else{
               mp.put(str.charAt(i),1);
            }
        }
        int high=0;
        for(Map.Entry<Character,Integer> mee:mp.entrySet()){
            if(high<=mee.getValue()){
                high=mee.getValue();
            }
        }
       for(Map.Entry<Character,Integer> mee:mp.entrySet()){
          if(high==mee.getValue()){
            System.out.println(mee.getKey()+" appears "+mee.getValue());
          }
       }
    }
}
