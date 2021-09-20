package raj.abstractMethods;

 interface BiCycle{  // classs
    int a= 45;
    void applyBrake(int decrement);  //method
    void SpeedUp(int increment);
}
interface HornBiCycle{  // classs
    void blowHornK3g();
    void blowHornMhn();
}
class AvonCycle implements BiCycle,HornBiCycle {  // class
    int Speed = 7;

    public void blowHorn() {
        System.out.println(" pee pee po po ");
    }

    public void applyBrake(int decrement) {
        System.out.println(" applying brake ");
    }

    public void SpeedUp(int increment) {
        System.out.println(" applying SpeedUp ");
    }

    public void blowHornK3g() {
        System.out.println(" kabhi khushi kabhi gum pee pee ");
    }


    public void blowHornMhn() {
        System.out.println(" main heon naa po po po ");
    }
}
    public class InterFace {
        public static void main(String[] args) {
// create a new objec class  AvonCycle
            AvonCycle obj = new AvonCycle();
            obj.blowHorn();
            obj.applyBrake(1);
            obj.SpeedUp(7);
            obj.blowHornK3g();
            obj.blowHornMhn();
            System.out.println(obj.a);
        }
    }
