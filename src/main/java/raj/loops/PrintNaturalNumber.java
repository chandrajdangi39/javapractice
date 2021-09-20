/*1. WAP to print 1 to N natural numbers
       Class NaturalNumber and
       method name is printNaturalNumber() which will accept int as a argument.
        method name is printNumInReverseOrder() which will accept int as a argument.*/

package raj.loops;

public class PrintNaturalNumber{
    public void printNumber(int n) {
        for (int i = 1; i < n; i++) {
            System.out.print(i+" ");
        }

    }

    public static void main(String[] args) {
        PrintNaturalNumber  pn = new PrintNaturalNumber();
        pn.printNumber(10);

    }

}