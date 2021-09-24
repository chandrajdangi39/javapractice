//1.3 print down right L pattern :  printDownRightLPattern(int n)
//
//        * * * *
//        * * *
//        * *
//        *
package raj.loops;
public class PrintDownRightLPattern {
    public void downRightLPattern(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String [] argd){
        PrintDownRightLPattern obj = new PrintDownRightLPattern();
        obj.downRightLPattern(4);
    }
}
