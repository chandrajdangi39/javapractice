package raj.loops;

import raj.ifelse.IsNumberDivisibility;

public class EvenNumbersInArray {

    public static void main(String[] args) {
        int [] arr = {1,4,2,3,7,6,8,10};
        printEvenNumber(arr);
    }

    public static void printEvenNumber(int [] arr){
        for(int i = 0;i<arr.length;i++){
            if(IsNumberDivisibility.isNumberDivisibleByTwo(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }
}
