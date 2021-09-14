package raj.oops;
class MySeniorEngineer{
    private int id;
    private String name;

    public MySeniorEngineer(){
        id =45;
        name = "myName";
    }
    public MySeniorEngineer(String myName){
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
public class ConstructorOverloading{
    public static void main(String [] args){
// instantation a new MyEmpolyee object
        MySeniorEngineer harry = new MySeniorEngineer();

        // harry.setName("codeWithHarry");
// setting attribute
        // harry.setId(23);
        System.out.println(harry.getId());

        System.out.println(harry.getName());
    }
}