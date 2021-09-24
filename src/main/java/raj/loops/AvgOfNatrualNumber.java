//5. Average of N natural numbers
package raj.loops;
public class AvgOfNatrualNumber {
    public float avgNaturalNumber(float n){
        float sum =0.0f;
        for(float i=1;i<n;i++){
            sum = sum+i;
        }
        return sum/n;
    }

    public static void main(String [] args){
        AvgOfNatrualNumber obj = new AvgOfNatrualNumber();
       float result= obj.avgNaturalNumber(15);
        System.out.println(result);
    }
}
