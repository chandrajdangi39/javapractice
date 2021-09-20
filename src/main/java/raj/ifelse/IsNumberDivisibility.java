//2. WAP to find if number is divisible by 2 or not.
//Signature : isNumberDivisibleByTwo that will accept int as argument (number) and return true if number is divisible by 2 else false
//className is NumberDivisibility
package raj.ifelse;
public class IsNumberDivisibility {
    //<visibility> static returnType methodName( arg...)
    public static boolean isNumberDivisibleByTwo(int n){
        if(n%2==0){
            return true;
        }else{          // else if(n%2==1)  odd
            return false;
        }
    }
    public static void main(String [] args){
        System.out.println(isNumberDivisibleByTwo(15));
    }
}

