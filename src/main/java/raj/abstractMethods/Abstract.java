package raj.abstractMethods;
abstract class Phone{  // class
    abstract void on();  // methd
}
class SmartPhone extends Phone {  //class
    @Override
     void on(){
    }
    void run(){  // method
        System.out.println(" turning on smartphone ");
    }
}
public class Abstract{
    public static void main(String [] args){
// create a new object class SmartPhone
//Phone p = new SmartPhone();
        SmartPhone sm = new SmartPhone();
        sm.run();
       // System.out.println(sm.run());
    }
}

