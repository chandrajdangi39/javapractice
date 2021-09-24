//1.2 print down left L pattern : printDownLeftLPattern(int n)
//
//        * * * *
//        * * *
//        * *
//        *
package raj.loops;
public class PrintDownLeftLPattern {
    public void downLeftPattern(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String [] args){
        PrintDownLeftLPattern obj = new PrintDownLeftLPattern();
        obj.downLeftPattern(4);
    }
}
