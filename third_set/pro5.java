public class pro5 {
    public static void main(String[] args){
        
        String testing="abcdefghijklmnopqrstuvwxyz";
        for(char ch='a';ch<='z';ch++){
            if(!testing.contains(Character.toString(ch))){
               System.out.println("Its not a pangram");
               System.exit(0);
            }
        }
        System.out.println("Its a pangram string");
    }
}
