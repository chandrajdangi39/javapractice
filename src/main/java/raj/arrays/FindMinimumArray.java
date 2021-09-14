package raj.arrays;
public class FindMinimumArray {
    public static void main(String [] args) {
        int[] marks = {7,6,5,4,3,2,2,1,0};
        int min = marks[0];

        for (int i=1;i<marks.length;i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
        }

        System.out.println(min);
    }

}