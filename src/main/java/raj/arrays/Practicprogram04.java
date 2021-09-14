package raj.arrays;
public class Practicprogram04{
    public static void main(String args []){
        int[] arr = {1,2,366,4,5,6};
        int max = 0;
        for(int e:arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println(" the value of maxmum is "+max );
    }
}
