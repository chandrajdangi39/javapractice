package raj.ifelse;
import java.util.Scanner;
public class Elseifprogram11{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your age");
        int age;
        age = sc.nextInt();
        if(age>56){
            System.out.println(" you are exprienced! ");
        }
        else if(age>46){
            System.out.println(" you are semi exprienced! ");
        }
        else if(age>36){
            System.out.println(" you are semi-semi exprienced! ");
        }
        else {
            System.out.println(" you are not exprienced! ");
        }
    }
}
