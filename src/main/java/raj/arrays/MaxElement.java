package raj.arrays;
public class MaxElement{
    public static void main(String [] args){
        int [] marks ={10,10,10,5,5,2,-1};
        int max = marks[0];
        for(int i=1;i<marks.length;i++){
            if(marks[i]>max){
                max =marks[i];
            }
        }
        System.out.println(max);
    }
}