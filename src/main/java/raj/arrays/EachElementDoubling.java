//9. doubling the each element of array and return new array not the existing one
//
//input : int [] arr = {1,2,4,5,6}
//output : {2,4,8,10,12}
//signature : public int [] doublingClonedArr( int [9. doubling the each element of array and return new array not the existing one
//
//input : int [] arr = {1,2,4,5,6}
//output : {2,4,8,10,12}
//signature : public int [] doublingClonedArr( int [] arr)
package raj.arrays;

public class EachElementDoubling {
    public void doublingEachElement(int [] arr,int length){
        for (int i=0;i<length;i++){

            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6};
        EachElementDoubling obj = new EachElementDoubling();
        obj.doublingEachElement(arr,arr.length);
    }
}
