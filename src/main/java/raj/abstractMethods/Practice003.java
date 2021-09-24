//Create a class monkey with jump ( ) and bite ( ) methods Create a class human whichinherits this monkey class and implements basicanimal interface with eat ( ) and sl
package raj.abstractMethods;
class Monkey{
    public void jump(){
        System.out.println(" jumping ");
    }
    public void bite(){
        System.out.println(" biting");
    }
}
interface basicAnimal{
    public void eat();
    public void sleep();
}
class Human extends Monkey implements basicAnimal{
    @Override
    public void eat(){
        System.out.println(" eating.. ");
    }
    @Override
    public void sleep(){
        System.out.println(" sleeping...");
    }
    public void speak(){
        System.out.println(" hellow sir");
    }
    public void overTake(){
        System.out.println(" overtake the car ");
    }

}
public class Practice003 {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.eat();
        obj.bite();
        obj.overTake();
        obj.sleep();
        obj.speak();
    }
}
