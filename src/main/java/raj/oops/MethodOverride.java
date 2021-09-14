package raj.oops;
class A1{
public void Meth1(){
        System.out.println(" i am meth1 of class a");
        }
        public void Meth2(){
           // System.out.println();
            System.out.println(" i am meth2 of class a");
        }
        public void Meth4(){
            System.out.println(" i am meth4 of class a ");
        }
        }
class B extends A1{
   @Override
   public void Meth4(){
       System.out.println(" i am meth4 of class B ");

   }
    public void Meth2(){
        System.out.println(" i am meth2 of class b ");
    }
    public void Meth3(){
        System.out.println(" i am meth3 of class B ");
    }
}

public class MethodOverride{
    public static void main(String [] args){
// create a new object class A
     //   A1 a = new A1();
     //   a.Meth2();
        B b= new B();
        b.Meth2();
        b.Meth1();
        b.Meth3();
        b.Meth4();
    }
}

