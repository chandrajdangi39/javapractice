//6. Sum of odd indexed position's elements of array .
// int [] arr = {1,3,6,8,22,5,6}
//    output   = 16    (3+8+5)
package raj.arrays;
public class SumOfOddPositionedArray {
    public void oddIndexPositionedSum(int [] arr,int length){
        int sum = 0;
        for(int i=0;i<length;i++){
            if(i%2==1){
                sum = sum+arr[i];
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {

        int [] arr = {1,3,6,8,22,5,6};
        SumOfOddPositionedArray sp = new SumOfOddPositionedArray();
        sp.oddIndexPositionedSum(arr,arr.length);
    }
}
