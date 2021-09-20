//3. WAP to find if number is even or odd
//Signature : isEven that will accept int as argument (n) and return true if number is even and if number is odd then return false
//className isEvenOdd
package raj.ifelse;
public class EvenOddNumber{
     static String isEven(int n){
        if(n%2==0){
            return "evenNumber";
        }
        else{          // else if(n%2==1)  odd
            return "oddNumber";
        }
    }
    public static void main(String [] args){
        System.out.println(isEven(15));
        //   isEven(16);
    }
}

