package raj.Practiceset;
import java.util.Scanner;
public class Practice05 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your physis marks : ");
        int physis = sc.nextInt();
        System.out.println(" enter your chemistry marks : ");
        int chemistry = sc.nextInt();
        System.out.println(" enter your methamatic marks : ");
        int methamatic = sc.nextInt();
        System.out.println(" enter your english marks : ");
        int english = sc.nextInt();
        System.out.println(" enter your computers marks : ");
        int computers = sc.nextInt();
        float percentage = (physis+chemistry+methamatic+english+computers)/(500.0f)*100;
        System.out.println( percentage  );
    }
}
