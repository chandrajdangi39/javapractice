//1. Print below patterns
//        1.1 print L pattern : printLeftLPattern(int n)
//        *
//        * *
//        * * *
//        * * * *
package raj.loops;
public class PrintLPattern {
    public void printPattern(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String [] args){
        PrintLPattern obj = new PrintLPattern();
        obj.printPattern(4);
    }
}
