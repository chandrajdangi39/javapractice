//6. WAP to check number is prime or not ( prime number is number which is divisible by itself and 1)
//class PrimeNumber ,  method is isPrime() which wil accept int as a argument and return true if number is prime
//        else return false
//        input : n = 8
//        output false
//        input 17
//        output true
package raj.loops;
public class ToCheckPrimeNumber {
    //<visibility> <static or non static> <return type> <method name>(argument){
    public boolean isPrime(int n){
        if(n%2==1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String [] args){
        ToCheckPrimeNumber obj= new ToCheckPrimeNumber();
        boolean result= obj.isPrime(17);
        System.out.println(result);
    }
}
