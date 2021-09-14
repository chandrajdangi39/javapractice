//  create a class tommy for rockstar game hitting (print hitting..), runinng, fireing etc..
package raj.oops;
class tommy{


    public void hit(){
        System.out.println("hitting...");

    }
    public void run(){
        System.out.println("runing..");

    }
    public void fire(){
        System.out.println("fireing..");
    }
}
public class Practice05{
    public static void main(String [] args){

        tommy player1 = new tommy();
// instantation a new object object
        player1 .hit();
        player1.fire();
        player1.run();


    }
}