package raj.loops;
public class BreakDoWhileloop {
    public static void main(String [] args){
        int i=0;
        do {
            System.out.println(i);
            if (i == 2) {
               // System.out.println();
                break;
            }
            i++;
        }while (i < 5) ;

            System.out.println(" ends loop here ");

    }
}

