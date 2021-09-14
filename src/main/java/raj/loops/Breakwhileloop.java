package raj.loops;
public class Breakwhileloop{
    public static void main(String [] args){
        int i=0;
        while(i<5){
            System.out.println(i);
            System.out.println(" java is great ");
            i++;
            if(i==2){
                System.out.println(" ending the loop ");
                break;
               // i++;
            }
        }
    }
}