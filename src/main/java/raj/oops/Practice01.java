//create a class Employee with following properties and method
package raj.oops;
class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
    public class Practice01{
        public static void main(String [] args){
            Employee raju = new Employee();
            raju.setName("codeWithRaju");

            raju.salary = 234;

            System.out.println(raju.getName());
            System.out.println(raju.getSalary());
        }
    }