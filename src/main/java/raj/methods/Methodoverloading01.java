package raj.methods;
public class Methodoverloading01{
    static void change(int a){
        a = 98;
        System.out.println(" i invented a new word!\n "+" plagiansum ");
    }
    public static void main(String [] args){
        int []marks = {52,543,7,89,98,94};
        int x = 45;
        change(x);
        System.out.println(" the value of x after runing change "  +x);
    }
}