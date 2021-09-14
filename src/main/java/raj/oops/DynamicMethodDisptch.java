package raj.oops;
class  phone{
    public void showtime(){
        System.out.println(" time is 8am ");
    }
    public void on(){
        System.out.println(" turninig on phone ");
    }
}
class smartPhone extends  phone{
    public void Music(){
        System.out.println(" plying music ");
    }
    public void on(){
        System.out.println(" turninig on Smartphone ");
    }
}
public class DynamicMethodDisptch {
    public static void main(String[] args) {
// create an object
        phone obj = new smartPhone();
        obj.showtime();
        obj.on();
        //obj.Music(); not allowed
        // create an object class dynamic
      //  SmartPhone obj = new phone(); //not allowed
        //  smartPhone obj = new smartPhone();
       // obj.Music();
      //  obj.on();
    }
}
