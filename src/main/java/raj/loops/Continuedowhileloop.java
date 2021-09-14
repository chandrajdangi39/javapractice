package raj.loops;
public class Continuedowhileloop {
    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            if (i == 2) {
                System.out.println(" ending the loop ");
                continue;
            }
            System.out.println(i);
        }
        while (i < 7);
        System.out.println(" loop ends here ");
    }
}







