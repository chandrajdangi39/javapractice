package raj.abstractMethods;
interface sampleInterface{
    public void meth1();
    public void meth2();
}
interface childInterface extends sampleInterface{
    public void meth3();
    public void meth4();
}
class MySampleClass implements childInterface {
    public void meth1() {
        System.out.println(" meth1 ");
    }

    public void meth2() {
        System.out.println(" meth2 ");
    }

    public void meth3() {
        System.out.println(" meth3 ");
    }

    public void meth4() {
        System.out.println(" meth4 ");
    }
}
public class InheritanceInInterface {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
