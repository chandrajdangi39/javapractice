package raj.methods;
public class Method01{
    static int logic(int x,int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }



            public static void main(String [] args){

            System.out.println(logic(5,7));
        }
    }
