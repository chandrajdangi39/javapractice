package raj.methods;
public class Practic03{
    static int sumrec(int n) {
        if (n == 1) {
            return 1;
        }
        return  n +sumrec(n - 1);
    }

    public static void main(String [] args){
        int c = sumrec(6);
        System.out.println(sumrec(6));
    }
}

