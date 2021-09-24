//4. Print even index positioned array element for given Array.(Assume array index start from 0)
//        int [] arr = {1,3,6,8,22,5,6}
//        output   = 1 6 22 6
package raj.arrays;
public class PrintEvenIndexPositioned {
    public void evenIdexPositioned(int [] arr,int length){
        for(int i=0;i<length;i++){
            if(i%2==0){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        //<data type>[] varName = {data type};
        int [] arr = {1,3,6,8,22,5,6};
        PrintEvenIndexPositioned pi = new PrintEvenIndexPositioned();
        pi.evenIdexPositioned(arr,arr.length);
    }
}
