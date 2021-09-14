package raj.oops;
class student{
    int id;
    String name;
  // public String getName() {
       // return getName();
    }
   // }
    public class AccessModiFiers{
        public static void main(String [] args) {
// instantation a new MyEmpolyee object
            student harry = new student();
            harry .id = 45;
            harry.name = "raam";
            System.out.println(harry.name);
            System.out.println(harry.id);
        }
}