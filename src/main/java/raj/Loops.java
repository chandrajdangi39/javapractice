package raj;
public class Loops {
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
        while (i < 5);
        System.out.println(" loop ends here ");
    }
}







