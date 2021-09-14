package raj.loops;
public class Practices4{
    public static void main(String [] args){
        int n = 5;
        int i = 3;
        int factorial = 1;
        while(i<=n){
            factorial *= i;
            i++;
           // i--;
        }
        System.out.println(factorial);
    }
}