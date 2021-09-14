package raj.loops;

public class Practices5 {
    public static void main(String [] args) {
        int n = 6;
        //int i = 1;
        int factorial = 1;
        for (int i =1; i<=n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
