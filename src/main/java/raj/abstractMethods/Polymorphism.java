package raj.abstractMethods;
interface MyCamera2{
    public void takeSnap();
    public void recordVideo();

    public void greet2();

    default void record4kVideo(){
        System.out.println(" recording in 4k...");
    }
}
interface MyWifi2{
    public String [] getNetwork();
    public void connectTwoNetwork(String network);
}
class MyCellPhone2{
    public void callNumber(int phoneNumber){
        System.out.println(" calling "+phoneNumber);
    }
    public void pickCall(){
        System.out.println(" connecting ");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyWifi2,MyCamera2{
    @Override
    public void takeSnap(){
        System.out.println(" taking snap ");
    }

    @Override
    public void recordVideo() {

    }

   @Override
    public void record4kVideo() {
        MyCamera2.super.record4kVideo();
   }
@Override
public void greet2(){
    System.out.println("goodmorning");
}
    public void recordingVideo(){
        System.out.println(" taking video ");
    }
    public String [] getNetwork(){
        System.out.println(" getting list of network ");
        String [] networkList = {" harry "," prashnath "," anjali5G "};
        return networkList;
    }
    public void connectTwoNetwork(String network){
        System.out.println(" connecting to "+network);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        MySmartPhone2 obj = new MySmartPhone2();
       String [] networkList= obj.getNetwork();
       for(String item:networkList){
           System.out.println(item);
       }
       // obj.connectTwoNetwork();
        obj.callNumber(567);
        obj.greet2();
        obj.takeSnap();
        obj.recordingVideo();
        obj.connectTwoNetwork("netwirk");
    }
}
