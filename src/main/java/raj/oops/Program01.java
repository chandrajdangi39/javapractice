package raj.oops;
class cylinder{
    private int raidus;
    private int height;

    public int getRadius(){
        return raidus;

    }
    public void setRadius(int Radius){
        this.raidus =raidus;

    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }


}
public class Program01{
    public static void main(String [] args){
// instantation a new cylinder object
        cylinder mycylinder = new cylinder ();

        mycylinder.setHeight(12);
        mycylinder.getHeight();
        System.out.println(mycylinder.getHeight());
       // mycylinder.setRadius(9);
       // mycylinder.getRadius();
        System.out.println(mycylinder.getRadius());
        mycylinder.setRadius(9);
        mycylinder.getRadius();
    }
}