package raj.arrays;
public class Practicprogram03{
    public static void main(String [] args){
        int[][]mat1 = {{1,2,3},
                       {4,5,6}};
        int[][]mat2 = {{2,6,13},
                       {3,7,1}};
        int[][]result = {{0,0,0},
                         {0,0,0}};
        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[1].length;j++){
               // System.out.format("setting value for i=%d and j=%d\n",i,j);
                System.out.print(result[i][j]+ " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }
    }
}


