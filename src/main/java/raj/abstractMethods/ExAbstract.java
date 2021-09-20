package raj.abstractMethods;
abstract class Parent2{   //class 1
    public Parent2(){   // constructor
        System.out.println(" i am constructor class of Parent2 ");
    }
    public void sayHellow(){  // abstract method
        System.out.println(" hellow ");
    }
    abstract public void greet();
    abstract public void greet2();  // abstractMethods
}
class Child2 extends Parent2{   // class 2
    @Override
    public void greet(){  // method
        System.out.println(" good morning ");
    }
    @Override
    public void greet2(){  // method
        System.out.println(" good afternoon ");
    }
}
abstract class Child3 extends Parent2{  // class 3
    public void th(){
        System.out.println(" i am good ");
    }
}
public class ExAbstract{
    public static void main(String [] args ){  // main method
        // create a new object class Child2
        Child2 obj = new Child2();
        obj.sayHellow();
        obj.greet();
        obj.greet2();


            }
        }


