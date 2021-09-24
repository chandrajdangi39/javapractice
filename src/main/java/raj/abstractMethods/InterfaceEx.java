package raj.abstractMethods;
interface MyCamera{
    public void takeSnap();
    public void recordVideo();
    public void greet();


    default void record4kVideo(){
        System.out.println(" recording in 4k...");
    }
}
interface MyWifi{
    public String [] getNetwork();
    public void connectTwoNetwork(String network);
}
class MyCellPhone{
    public void callNumber(int phoneNumber){
        System.out.println(" calling "+phoneNumber);
    }
    public void pickCall(){
        System.out.println(" connecting ");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{
    @Override
    public void takeSnap(){
        System.out.println(" taking snap ");
    }

    @Override
    public void recordVideo() {

    }

    @Override
    public void record4kVideo() {
        MyCamera.super.record4kVideo();
    }
    @Override
    public void greet(){
        System.out.println(" good morning ");
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
public class InterfaceEx {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4kVideo();
         String [] ar =ms.getNetwork();
         for(String item:ar){
             System.out.println(item);
         }
        ms.greet();
        ms.takeSnap();
        ms.connectTwoNetwork("network");
        ms.recordingVideo();
       // ms.getNetwork();
    }
}
