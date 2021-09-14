package raj.methods;
public class Recursionusingforloop {
    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }
    }
        public static void main(String [] args){
            int n=5;

            System.out.println(factorial_iterative(n));
        }
    }
