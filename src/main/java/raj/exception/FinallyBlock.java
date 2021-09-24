package raj.exception;

public class FinallyBlock {
    public static int greet(){
        try {
            int a = 50;
            int b = 10;
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println(" cleaning up resources...this is the end of function ");
        }
        return -1;
    }

    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
        int a = 7;
        int b = 9;
        while (true){
            try {
                System.out.println(a/b);
            }
            catch (Exception e){
                break;
            }
            finally {
                System.out.println(" i am finally value of b "+b);
            }
            b--;
        }
        try {
            System.out.println(" yes this is finally");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
