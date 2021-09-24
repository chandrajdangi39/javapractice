
package raj.abstractMethods;
abstract class Pen2{
  abstract public void write2();
   abstract public void refill();
}
class FountainPen extends Pen2{
    @Override
    public void write2(){
        System.out.println(" write");
    }
    @Override
    public void refill(){
        System.out.println();
        System.out.println(" refill ");
    }
    public void nib(){
        System.out.println(" change nib ");
    }
}
public class Practice002 {
    public static void main(String[] args) {
        FountainPen obj = new FountainPen();
        obj.nib();
        obj.refill();
        obj.write2();
    }
}
