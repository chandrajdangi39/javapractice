//print odd numbers only of n natural numbers.
//        input : n = 21
//        output : 1 3 5 7 9 11 13 15 17 19 21
package raj.loops;
public class PrintOddNumber {
    public void oddNumber(int n){
        for(int i=1;i<=n;i++){
            if(i%2==1){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String [] args){
        PrintOddNumber obj =new PrintOddNumber();
        obj.oddNumber(21);
    }
}
