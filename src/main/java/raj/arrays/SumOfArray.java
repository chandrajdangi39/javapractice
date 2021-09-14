package raj.arrays;
public class SumOfArray {
    public static void main(String [] args){
        float [] marks = { 56.6f,45.5f,67.5f,78.5f,60.5f};
        float sum = 0;
        for(float element: marks){
            sum = sum + element;
        }
        System.out.println(" the value of sum is "+sum);
    }
}

