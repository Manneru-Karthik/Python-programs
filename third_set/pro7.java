public class pro7 {
    public static void main(String[] args) {
        int n=5;
        while(n!=1){
            if(n%2==0){
                n/=2;
            }else{
                n=3*n+1;
            }
        }
        boolean bool=(n==1)?true:false;
        System.out.println(bool);
    }
}
