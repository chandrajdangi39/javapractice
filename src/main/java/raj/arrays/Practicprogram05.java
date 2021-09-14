package raj.arrays;
public class Practicprogram05{
    public static void main(String args []){
        int[] arr = {1,2,366,4,5,6};
        int min = Integer.MAX_VALUE;
        for(int e:arr){
            if(e>min){
                min = e;
            }
        }
        System.out.println(" the value of minimum is "+min );
    }
}
