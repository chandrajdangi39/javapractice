package raj.loops;

public class Forloopusingwhileloop {
    public static void main(String [] args){
        int i = 0;
        while(i<5){
            System.out.println(i);
            System.out.println(" java is great ");
            if(i==3){
                System.out.println(" ending the loop ");
                break;
            }
            i++;
        }
    }
}
