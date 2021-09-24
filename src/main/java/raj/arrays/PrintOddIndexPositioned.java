//5. Print odd index positioned  array element for a given Array. (Assume array index start from 0)
//   int [] arr = {1,3,6,8,22,5,6}
//    output   = 3 8 5
package raj.arrays;

import raj.ifelse.EvenOddNumber;

public class PrintOddIndexPositioned {
    public void oddIndexPositioned(int [] arr,int length){
        for(int i=0;i<length;i++){
            if(!EvenOddNumber.isEven(i)){  ///EvenOddNumber.isEven(i) == false    isEven true if element even
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,3,6,8,22,5,6};
        PrintOddIndexPositioned obj = new PrintOddIndexPositioned();
        obj.oddIndexPositioned(arr,arr.length);
    }
}
