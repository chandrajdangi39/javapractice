//Create an abstract class pen with methods write () and refill () as abstract methods
package raj.abstractMethods;
abstract class Pen{
   abstract public void write();
   abstract public void refill();
}
class ChildP extends Pen{
    @Override
    public void write(){
        System.out.println(" write ");
    }
    @Override
    public void refill(){
        System.out.println(" refilling ");
    }
}
public class Practice01 {
    public static void main(String[] args) {
        ChildP obj = new ChildP();
        obj.refill();
        obj.write();
    }
}
