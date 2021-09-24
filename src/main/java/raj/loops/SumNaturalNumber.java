//4. Sum of N natural numbers.
package raj.loops;
public class SumNaturalNumber {
    public int sumOfNaturalNums(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
           // sum= sum+i;
            sum= n/2*(n+1);
        }
        return sum;
    }
    public static void main(String [] args){
        SumNaturalNumber obj = new SumNaturalNumber();
       int result= obj.sumOfNaturalNums(10);
        System.out.println(result);
    }
}
