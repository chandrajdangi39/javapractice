package raj.exception;

import java.util.Scanner;

public class SpecificException {
    public static void main(String[] args) {
        //<data type>[] varName = {data type};
        //                      = new <data type>[] ;
        int [] arr = new int [3];
        arr [0] = 7;
        arr [1] = 56;
        arr [2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your arr index ");
        int index = sc.nextInt();
        System.out.println(" enter your number you went divided the value with ");
        int number =  sc.nextInt();
        try{
            System.out.println(" the value at array index endered "+arr [index]);
            System.out.println("  the value of array value/number is "+arr [index]/number);
        }
        catch (ArithmeticException e){
            System.out.println(" arithmethicException occured ");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" ArrayIndexOutOfBoundsException ");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(" some other exception occured ");
            System.out.println(e);
        }
        System.out.println(" end of program ");
    }
}
