//7. Avg of even indexed position's elements of array
//   int [] arr = {1,3,6,8,22,5,6}
//       output   = 8.75   (  35/4  (1+6+22+6))
package raj.arrays;

import raj.ifelse.EvenOddNumber;

public class AvgOfEvenPositioned {
    public float evenIndexPositionedElement(int [] arr,int length){
        float sum = 0;
        int count = 0;
        for(int i=0;i<length;i++){
            if(EvenOddNumber.isEven(i)){
                sum = sum+arr[i];
                count = count+1;
            }
        }
        //System.out.println("sum" + sum + " avg "+ (float)sum/count);

        float avg = sum/count;
        return avg;
    }

    public static void main(String[] args) {
        int [] arr = {1,3,6,8,22,5,6};
        AvgOfEvenPositioned obj = new AvgOfEvenPositioned();
        float avg = obj.evenIndexPositionedElement(arr,arr.length);
        System.out.println(avg);
    }
}
