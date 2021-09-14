// create a class rectangle repeat 3
package raj.oops;
class rectangle{
    int width;
    int length;

    public int area(){
        return width*length;

    }
    public int perimeter(){
        return (width+length)+(width+length);

    }

}
public class Practice04{
    public static void main(String [] args){

        rectangle rt = new rectangle();
// instantation a new sequare object
        rt. width =4;
        rt. length = 5;
        System.out.println(rt.area());
        System.out.println(rt.perimeter());
    }
}