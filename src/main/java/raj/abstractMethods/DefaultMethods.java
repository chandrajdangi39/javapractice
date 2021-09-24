package raj.abstractMethods;
interface Animal{
    default void say(){ // default method
        System.out.println(" hellow this is default method ");
    }
    public void bark(); //abstrac method
}
class Cwh implements Animal{
    @Override
    public void bark(){
        System.out.println(" dog bark !");
    }
}
public class DefaultMethods {
    public static void main(String[] args) {
        Cwh obj = new Cwh();
        obj.bark();
        obj.say();
    }
}
