package raj.methods;
public class Varargs{
   /* static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b, int c,int d){
        return a+b+c+d;
    }*/


    static int sum(int...arr) {
        int result = 0;
        for (int a : arr) {
            result += a; // result = result + a;
        }
        return result;
    }

    public static void main(String [] args){
       // System.out.println(" welcome to varargs tutorial ");
      //  System.out.println(" the sum of 4 and 5  "+sum(4,5));
        //System.out.println(" the sum of 4,5,7 and 6 "+sum(4,5,6,7));

        //generic sum method calls ..
        System.out.println(sum(4,5,6));
        System.out.println(sum(4,5,6,7,7));
        System.out.println(sum(4,5,6,7,3,8,9));

    }
}
