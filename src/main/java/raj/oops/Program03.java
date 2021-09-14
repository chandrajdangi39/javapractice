package raj.oops;
// create a class cylinder use a constructor

class NewCylinder{
    private double surface;
    private double volume;
    private int radius;
    private int height;

    public NewCylinder(int radiud,int height){
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public double getSurface(){
        return 2*3.14*height*(radius+height);
    }
    public double getVolume(){
        return 3.14*radius*radius*height;
    }
}
public class Program03{
    public static void main(String [] args){
// instantation a new newcylinder object

        NewCylinder N  = new NewCylinder(9,10);

        N.getRadius();
 //  NewCylinder.setRadius(8);
   System.out.println(N.getRadius());
        N.getHeight();
 N.setHeight(12);
        System.out.println(N.getHeight());
  System.out.println(N.getSurface());
   System.out.println(N.getVolume());
    }
}

