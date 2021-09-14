package raj.loops;
public class Continuestatementwhileloop{
    public static void main(String [] args){
        int i = 0;
        while(i<5) {

            System.out.println(i);
            System.out.println(" java is great ");
            i++;
            if (i == 2) {
                // System.out.println(i);
                System.out.println(" ends loops here ");
               // continue;
                break;

            }
        }
    }
}
