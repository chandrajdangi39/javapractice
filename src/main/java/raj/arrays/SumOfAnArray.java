package raj.arrays;

public class SumOfAnArray {
    public static void main(String [] args){
        int [] marks = {20,40,60,70,80,90};
        int sum = 0;
        for(int i=0;i< marks.length;i++){
            sum = sum+ marks[i];

          //  System.out.println(sum);
        }
        System.out.println(sum);
    }
}
