//3. Print every fifth number of n natural numbers
//        input : n = 21
//        output : 5 10 15 20
package raj.loops;
public class PrintFifthNaturalN {
    public void fifthNaturalNumber(int n){
        int i=0;
        while (i<=n && i+5 < n){
            i = i+5; // i+= 5 // i+=1(i++)
            System.out.println(i);
        }

    }

    public static void main(String [] args){
        PrintFifthNaturalN obj = new PrintFifthNaturalN();
        obj.fifthNaturalNumber(21);
    }
}
