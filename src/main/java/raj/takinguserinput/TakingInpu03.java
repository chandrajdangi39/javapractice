package raj.takinguserinput;
import java.util.Scanner;
public class TakingInpu03 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number 1 ");
        double b1 = sc.nextDouble();
        System.out.println(" enter number 2 ");
        double b2 = sc.nextDouble();
        double sum = b1+b2;

        System.out.println(" the sum of these number "+ sum);
    }
}
