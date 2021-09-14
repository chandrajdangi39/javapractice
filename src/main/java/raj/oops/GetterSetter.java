package raj.oops;
class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
       this.name = n;
    }
    public void setId(int i){
       this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class GetterSetter{
    public static void main(String [] args){
// instantation a new MyEmpolyee object
       MyEmployee harry = new MyEmployee();

        harry.setName("codeWithHarry");
// setting attribute
        harry.setId(23);
        System.out.println(harry.getId());
      //  harry.setId(234);
      //  System.out.println(harry.getId());
    }
}