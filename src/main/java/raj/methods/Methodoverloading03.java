package raj.methods;
public class Methodoverloading03{
    public static void main(String [] args){

        //int a = 10;
       // foo();
        foo(400,67);
    }
    static void foo(){
        System.out.println(" good morning bro! ");
    }
    static void foo(int a ,int b){

        System.out.println(" good morning "+a+" bro!"+b);
        foo();

    }
}
