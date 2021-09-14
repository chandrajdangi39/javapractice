package raj.oops;
// create a class sphere useing constructor,setter, getter

class Sphere{
    private double radius;
    private double areaSurface;
    private double volume;

    public Sphere(double radius,double areaSurface,double volume){
        this.radius = radius;
        this.areaSurface = areaSurface;
        this.volume = volume;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getSurfaceAera(){
        return 4*3.14*radius*radius;
    }
    public double getvolume(){
        return 4/3*3.14*radius*radius;
    }
}
public class Program06{
    public static void main(String [] args){
//  instantation a new sphere object
        Sphere mySphere = new Sphere(9.0,1017.76,254.34);
        mySphere.setRadius(9.0);
        System.out.println(mySphere.getRadius());
        System.out.println(mySphere.getSurfaceAera());
        System.out.println(mySphere.getvolume());
    }
}
