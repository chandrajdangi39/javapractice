//2. traverse int array from right to left  (printArrayFromRight(int [] arr)
package raj.arrays;
public class PrintAnArrayReverse {
    //<data type>[] varName = {data type};
    public void printArray(int [] arr,int length){
        for(int i=length-1;i>0;i--){
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        int [] arr = {3,4,6,34,67,23};
        PrintAnArrayReverse pr = new PrintAnArrayReverse();
        pr.printArray(arr,arr.length);
    }
}
