package raj.oops;
class Empolyee {
    int id;
    int salary;
    String name;

    public void printDetails(){
        System.out.println(" my id is "+id);
        System.out.println(" and my name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}



public class Custom{
    public static void main(String [] args){
        Empolyee harry = new Empolyee(); // instantation a new empolyee object
        harry.id= 12;
        harry.salary =34;
        // setting attribute
        harry.name= " codeWithHarry ";
        // instantation a new Empolyee object
        Empolyee raam = new Empolyee();
        raam.id= 17;
        raam.salary= 12;
        raam.name= " codeWithHarry";
      //  System.out.println(harry.id);
      // System.out.println(harry.name);
       harry.printDetails(); //
       raam.printDetails();
       int salary =raam.getSalary();
       System.out.println(salary);
    }
}