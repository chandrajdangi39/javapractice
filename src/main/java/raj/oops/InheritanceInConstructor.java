package raj.oops;
class Base1{
    Base1(){
System.out.println(" i am an constructors ");
}
Base1(int x){
    System.out.println(" i am an overloaded constructors with a value of x= "+x);
}
}
class Derived1 extends Base1{
    Derived1(){
System.out.println(" i am an Derived constructors ");
}
Derived1(int x,int y){
        super(x);
    System.out.println(" i am an overloaded constructors with a value of y= "+y);
}
}
class ChildofDerived extends Derived1{
    ChildofDerived() {
        System.out.println(" i am child of derived constructors" );
    }
    ChildofDerived(int x,int y, int z){
        super(x, y);

    System.out.println(" i am an overloaded constructors with a value of z= "+z);
}
}
public class InheritanceInConstructor{
    public static void main(String [] args) {

// create a new object
       //  Base1 b =new  Base1();
       //  Derived1 d = new Derived1();
      //  Derived1 d = new Derived1();
        ChildofDerived cd = new ChildofDerived(12,13,15);

    }
}
