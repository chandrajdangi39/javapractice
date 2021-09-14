package raj.oops;
class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
       id =45;
       name = " your-nama-here ";
    }
    public MyMainEmployee(String myName){
        id =45;
        name = myName;
    }

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
public class Constructor{
    public static void main(String [] args){
// instantation a new MyEmpolyee object
        MyMainEmployee harry = new MyMainEmployee();

       // harry.setName("codeWithHarry");
// setting attribute
       // harry.setId(23);
         System.out.println(harry.getId());

          System.out.println(harry.getName());
    }
}