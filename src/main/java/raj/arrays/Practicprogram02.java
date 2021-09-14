package raj.arrays;
public class Practicprogram02{
    public static void main(String [] args){
        float[] marks = {70.5f,50.5f,60.5f,40.5f,80.5f};
        float sum = 0;
        for(float element: marks){
            sum = sum + element;
        }
        System.out.println(" the value is avrrage marks is "+sum/marks.length);
    }
}
