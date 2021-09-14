package raj.ifelse;
import java.util.Scanner;
public class Elseifprogram{
    public static void main(String [] args){
        int day;
        System.out.println(" enter your day ");
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println(" monday ");


            case 2:
                System.out.println(" tuesday ");


            case 3:
                System.out.println(" wensday ");


            case 4:
                System.out.println(" thursday ");


            case 5:
                System.out.println(" friday ");
                break;
            }
        }
    }

