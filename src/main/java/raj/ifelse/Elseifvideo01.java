package raj.ifelse;
import java.util.Scanner;
public class Elseifvideo01{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your website ");
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println(" this is an oregnization website ");
        }
else if(website.endsWith(".com")){
            System.out.println(" this is an comertials website ");
        }
else if(website.endsWith(".in")){
            System.out.println(" this is an indian website ");
        }
    }
}