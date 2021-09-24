//1. Traverse int array from left to right ( printArrayFromLeft(int [] arr)
package raj.arrays;
public class TraverseAnArray {
    //<data type>[]varName = new <data type>[size]
    public void printArray(int [] arr,int length ){
        for(int i=0;i<length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int [] arr = {2,6,9,4,6};
        TraverseAnArray ta= new TraverseAnArray();
        ta.printArray(arr, arr.length);
    }
}
