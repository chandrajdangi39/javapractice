package raj.oops;
// used THIS. keyward
class Ekclass {
    int a;

    public int getA() {  // method
        return a;
    }

    Ekclass(int a) {  // constructor
        this.a = a;
    }

    public int Returnone() {   // method
        return 1;
    }
}
    class DoClass extends Ekclass {
        DoClass(int x) {  // constructor
            super(x);
            System.out.println(" i am an subclass constructor");
        }

    }


public class KeyWards{
    public static void main(String [] args){
// create a new ekclass object
      //  Ekclass e = new Ekclass(45);
       // e.setA(88);
      //  System.out.println(e.getA());
         DoClass d =new DoClass(7);
    }
}