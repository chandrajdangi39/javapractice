package raj.arrays;
public class MaxArray {
    public static void main(String [] args) {
        int[] arr = {1, 2, 3, 55, 6, 7};
        int max = 0;
        for (int e : arr) {

            if (e > max) {
                max = e;

        }
    }
        System.out.println(max);

}
}