package raj;
import java.util.Scanner;
public class Swtichprogram01{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your age");
        int age;
        age = sc.nextInt();
        switch(age){
            case 18:
                System.out.println(" you are going to become an adult! ");
               // break;

            case 23:
                System.out.println(" you are going to a job!");
               // break;

            case 68:
                System.out.println(" you are going to get retried! ");
                //break;

            default:
                System.out.println(" enjoy your life!");
        }
    }
}
