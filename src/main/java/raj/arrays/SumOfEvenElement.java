//8. Sum of even elements of the array
// int [] arr = {1,3,6,8,22,5,6}
//       output   = 42 (6+8+22+6)
package raj.arrays;

public class SumOfEvenElement {
    public void sumOfElement(int [] arr,int length){
        int sum=0;
        for(int i=0;i<length;i++){
            if(i%2==0){
                sum = sum+arr[i];
              ///  i= +4;
            }
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        int [] arr = {1,3,6,8,22,5,6};
        SumOfEvenElement obj = new SumOfEvenElement();
        obj.sumOfElement(arr,arr.length);
    }
}


