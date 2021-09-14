package raj.loops;
public class Continuestatementdowhileloop {
    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            if (i == 2) {
                // i++;
                System.out.println(" ending the loop ");
                continue;
            }

            System.out.println(i);
        }
        while (i < 5) ;
        }
        }


