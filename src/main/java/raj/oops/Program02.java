package raj.oops;
    // create a class cylinder to calculate surfac area and volume of the cylinder
class MyCylinder{
    private double surface;
    private double volume;
    private int radius;
    private int height;

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
public class Program02{
    public static void main(String [] args){
// instantation a new mycylinder object
        MyCylinder MainCylinder = new MyCylinder();
        MainCylinder.getRadius();
        MainCylinder.setRadius(8);
        System.out.println(MainCylinder.getRadius());
        MainCylinder.getHeight();
        MainCylinder.setHeight(12);
        System.out.println(MainCylinder.getHeight());
        System.out.println(MainCylinder.getSurface());
        System.out.println(MainCylinder.getVolume());
    }
}

