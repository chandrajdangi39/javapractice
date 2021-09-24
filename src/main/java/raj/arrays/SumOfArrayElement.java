
//3. Sum of array  element
package raj.arrays;
public class SumOfArrayElement {
    public void arrayElement(int [] arr,int length){
        int sum=0;
        for(int i=0;i<length;i++){
            sum = sum+arr[i];

        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int [] arr= {3,4,6,8,9,2,44,66,};
        SumOfArrayElement sm=new SumOfArrayElement();
        sm.arrayElement(arr,arr.length);

        //<data type>[]varName={data type};




    }

}
