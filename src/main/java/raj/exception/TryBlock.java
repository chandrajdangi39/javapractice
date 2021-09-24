package raj.exception;
public class TryBlock {
    public static void main(String[] args) {
        int a = 600;
        int b = 0;
     //   int c = a/b;
      //  System.out.println("the value is c"+c);
        try{
            int c = a/b;
            System.out.println(" the value c is "+c);
        }
       catch (Exception e){
           System.out.println(" we failed to divided. resion ");
           System.out.println(e);
       }
        System.out.println(" end of proogram ");
    }
}
