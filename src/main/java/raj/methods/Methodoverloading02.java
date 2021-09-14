package raj.methods;
public class Methodoverloading02{
    static void change2(int []arr){
        arr[0] = 98;
        System.out.println(" i invented a new word!\n "+" plagiansum ");
    }
    public static void main(String [] args){
        int []marks = {52,543,7,89,98,94};

        change2(marks);
        System.out.println(" the value of x after runing change2 "  + marks[0]);
    }
}