// creat a class cellPhone with method to print "rining...","vibrating..." etc
package raj.oops;
class cellPhone{
    public void ring(){
        System.out.println("ringing...");
    }
    public void vibrate(){
        System.out.println("vibrating...");
    }
    public void callFirend(){
        System.out.println("calling mukul...");
    }
  }
public class Practice02 {
    public static void main(String [] args){


        cellPhone realme = new cellPhone();
// instantation a new cellPhone object
        realme.callFirend();
        realme.vibrate();
        realme.ring();
    }
}