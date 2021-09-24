//7. Sum of even indexed position's elements of array
//   int [] arr = {1,3,6,8,22,5,6}
//       output   = 35 (1+6+22+6)
package raj.arrays;
public class SumOfEvenPosition {
    public void sumOfEvenPositionElement(int [] arr,int length){
       int sum = 0;
       //<inilization>;<condition>;<i++>
       for(int i =0;i<length;i++){
           if(i%2==0){
               sum = sum+arr[i];
           }
       }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int [] arr = {1,3,6,8,22,5,6};
        SumOfEvenPosition se = new SumOfEvenPosition();
        se.sumOfEvenPositionElement(arr,arr.length);
    }

}
