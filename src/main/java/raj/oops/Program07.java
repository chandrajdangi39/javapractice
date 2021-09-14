package raj.oops;
class worker{
    private int id;
    private int salary;
    private String name;

    //  public Employee(){
    //   id =45;
    //   name = " your-nama-here ";
    //  }
    public worker(int id,int salary,String name){
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public String getName(){
        return name;
    }
    // public void setName(String n){
    //     this.name = n;
    // }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }


}
public class Program07{
    public static void main(String [] args){
// instantation a new MyEmpolyee object
        worker harry = new worker(12,56,"ganesh");


        // harry.setName("codeWithHarry");
// setting attribute
        // harry.setId(23);
        System.out.println(harry.getId());
        System.out.println(harry.getSalary());

        System.out.println(harry.getName());
    }
}