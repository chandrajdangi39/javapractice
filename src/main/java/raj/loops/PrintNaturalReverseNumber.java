//1. WAP to print 1 to N natural numbers
//        Class NaturalNumber and
//        method name is printNaturalNumber() which will accept int as a argument.
//        method name is printNumInReverseOrder() which will accept int as a argument.
package raj.loops;

public class PrintNaturalReverseNumber {
    public void printNumberInReverseOrder(int n){
        for(int i=n;i>0;i--){
            System.out.print(i+" ");
        }
    }
    public static void main(String [] args){
        PrintNaturalReverseNumber r = new PrintNaturalReverseNumber();
        r.printNumberInReverseOrder(10);
    }


}
