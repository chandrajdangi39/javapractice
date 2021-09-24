//1.4 print right L pattern : printRightLPattern(int n)
//        *
//        * *
//        * * *
//        * * * *
package raj.loops;
public class PrintRightLPattern {
    public void rightLPattern(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        PrintRightLPattern obj = new PrintRightLPattern();
        obj.rightLPattern(4);
    }
}
