// create a class square with a method to initialize its side, calculate area,perimeter etc..
package raj.oops;
class sequare{
    int side;

    public int area(){
        return side*side;


    }
    public int perimeter(){
        return 4*side;

    }

}
public class Practice03{
    public static void main(String [] args){

        sequare sq = new sequare();
// instantation a new sequare object
        sq .side =4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}