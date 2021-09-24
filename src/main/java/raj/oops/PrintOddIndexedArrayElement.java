package raj.oops;

public class PrintOddIndexedArrayElement {

    public static void main(String[] args) {
        int [] arr  = {1,4,6,8,90};
        PrintOddIndexedArrayElement printOddIndexedArrayElement = new PrintOddIndexedArrayElement();
        printOddIndexedArrayElement.printOddIndexedArrayElement(arr,arr.length);
    }


    public void  printOddIndexedArrayElement(int [] arr,int length){
        for(int i = 0 ;i < length;i++){
            if(i % 2 == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
