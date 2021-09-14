package raj.arrays;
public class FindAvg{
 public static void main(String [] args){
     int [] marks = {1,2,3,45,67};
     int sum= 0;
     for(int i=0;i<marks.length;i++){
         sum =sum+marks[i];
     }
     System.out.println(sum/marks.length);
 }
}