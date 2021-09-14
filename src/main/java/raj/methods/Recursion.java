package raj.methods;
public class Recursion{
    static int factorial(int n){
       // factorial(0) =1
        // factorial(n) = n*(n-1)*n-2...1
        // factorial(5) = 5x4x3x2x1 = 120
        // factorial(n) = nxfactorial(n-1)
        if(n==0 || n==1){
            return 1;
        }
        else {

            return n*factorial(n-1);
        }
    }
    public static void main(String [] args){
        int n =6;
        System.out.println(" the value of factorial n is: "+factorial(n));
    }
}