//2. WAP to print even numbers only of n natural numbers.(start 1)
//        input : n = 21
//        output : 2 4 6 8 10 12 14 16 18 20
package raj.loops;
public class PrintEvenNumber {
    public void evenNumber(int n){
        for(int i=1;i<n;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String [] args){
        PrintEvenNumber obj = new PrintEvenNumber();
        obj.evenNumber(21);
    }

}
