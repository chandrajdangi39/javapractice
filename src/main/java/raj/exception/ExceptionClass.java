package raj.exception;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return " i am to string ";
    }
    @Override
    public String getMessage(){
        return " i am getmessage ";
    }
}
class MaxAgeException extends Exception {
    @Override
    public String toString() {
        return " age cannot be grater then 125 ";
    }

    @Override
    public String getMessage() {
        return " make sure that the value of age entered is correct ";
    }
}

public class ExceptionClass {
    public static void main(String[] args) {
     //   int a;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your age ");
      int  a = sc.nextInt();
        if(a<9){
            try {
                throw new ArithmeticException(" this is an exception ");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println(" finished ");
            }
            System.out.println(" yes finished ");
        }
    }

}
