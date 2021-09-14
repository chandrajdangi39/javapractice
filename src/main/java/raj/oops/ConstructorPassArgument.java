package raj.oops;
class MyMainEngineer{
    private int id;
    private String name;

    public MyMainEngineer(String myName,int myId){
        id =myId;
        name = myName;
    }
  //  public MyMainEngineer(String myName){
     //   id =45;
     //   name = myName;
   // }

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
public class ConstructorPassArgument{
    public static void main(String [] args){
// instantation a new MyEmpolyee object
        MyMainEngineer harry = new MyMainEngineer("programWithHarry", 12);

        // harry.setName("codeWithHarry");
// setting attribute
        // harry.setId(23);
        System.out.println(harry.getId());

        System.out.println(harry.getName());
    }
}