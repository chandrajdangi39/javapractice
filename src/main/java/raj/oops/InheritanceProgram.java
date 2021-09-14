package raj.oops;
// create a class animal and derived another class dog from it
class Animal{
     int x;
    public int getx(){
        return x;
    }
    public void setx(int x){
        System.out.println(" i am in animal setting x now ");
       // this.x =x;
    }
}
class Dog extends base{
     int y;
    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y = y;
    }
}

public class InheritanceProgram{
    public static void main(String [] args){

// create a new objec class Animal
       // Animal b = new Animal();
      //  b.setx(23);
      //  System.out.println(b.getx());
        // create a new object class dog
        Dog d = new Dog();
        d.setx(77);
        d.sety(33);
        System.out.println(d.getx());
        System.out.println(d.gety());
    }
}
