package raj.arrays;
public class Practicprogram01{
    public static void main(String [] args){
        float[]marks = {50.6f,70.7f,80.8f,90.5f,60.5f};
        float num = 80.8f;
        boolean isanarray = false;
        for(float element: marks){
            if(num==element){
                isanarray = true;
                break;
            }
        }
        if(isanarray) {
            System.out.println(" the value is present is an array ");
        }
else{
                    System.out.println(" the value is not present is an array ");
                }
            }
        }

