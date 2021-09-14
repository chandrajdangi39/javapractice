// repeat practice 04 for a circle
package raj.oops;
class circle{
    float radius;

    public float area(){
        return radius*radius*(3.14f) ;


    }
    public float perimeter(){
        return radius*radius*(3.14f);

    }

}
public class Practice06{
    public static void main(String [] args){

        circle cr = new circle();
// instantation a new sequare object
        cr. radius =15;
        System.out.println(cr.area());
        System.out.println(cr.perimeter());
    }
}