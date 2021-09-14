package raj.oops;
class base{
    int x;
    public int getx(){
        return x;
    }
    public void setx(int x){
        System.out.println(" i am in base setting x now ");
        this.x =x;
    }
}
class Derived  extends base{
    int y;
    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y = y;
    }
}

public class Inheritance{
    public static void main(String [] args){

// create a new objec class base
      //  base b = new base();
      //  b.setx(23);
      //  System.out.println(b.getx());
        Derived d = new Derived();
        d.setx(45);
        System.out.println(d.getx());
        d.sety(66);
        System.out.println(d.gety());
    }
}
