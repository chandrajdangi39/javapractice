package raj.methods;
public class Practic01{
    static void multification(int n){
        for(int i=1;i<=7;i++){
            System.out.format(" %d x %d = %d\n",n,i,n*i );
        }

        }

    public static void main(String [] args){
        multification(7);
    }
}