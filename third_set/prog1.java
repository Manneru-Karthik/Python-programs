import java.util.Scanner;
class prog1{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String enteredstring=sc.next();
    int front=0,end=enteredstring.length()-1;
    while(front<end) {
        if(enteredstring.charAt(front)!=enteredstring.charAt(end)){
            System.out.println("Its not a palindrome");
            System.exit(0);
        }
            front++;
            end--;
         }
    System.out.println("Its a palindrome string");    
    }
}