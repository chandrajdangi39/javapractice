package raj.loops;
public class Continuestatementnew{
    public static void main(String [] args){
        for(int i=0; i<50; i++){
            if(i==2){
                System.out.println(" ending the loop ");
                continue;
            }
            System.out.println(i);
        }
    }
}