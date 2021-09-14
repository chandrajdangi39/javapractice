
package raj.takinguserinput;
import java.util.Scanner;
public class TakingInpu01 {
    public static void main(String[] args) {
        System.out.println(" taking input from user ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number 1 ");
        byte a = sc.nextByte();
        System.out.println(" en9ter number 2 ");
        byte b = sc.nextByte();
        int sum = a + b;
        System.out.println("the sum of these number is " + (sum));
    }
}