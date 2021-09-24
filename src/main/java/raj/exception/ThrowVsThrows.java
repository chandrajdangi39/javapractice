package raj.exception;
class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return " radius cannot be negative ";
    }
    @Override
    public String getMessage(){
        return " radius cannot be negative ";
    }
}

public class ThrowVsThrows {
    public static double area(int r)throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }
    public static int divide(int a,int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
        try{
           // int c= divide(6,0);
            //sout(c);
            double ar = area(6);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println(" Exception ");
        }
    }

}
