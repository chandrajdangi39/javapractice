package raj.oops;
// create a class rectangle using overload constructor

class NewRectangle{
    private int length;
    private int beadth;

 //   public NewRectangle(){
  //      this.length = 4;
    //    this.beadth = 5;
  //  }
    public NewRectangle(int length,int beadth){
        this.length = length;
        this.beadth = beadth;
    }
    public int getLength(){
        return length;
    }
    public int getBeadth(){
        return beadth;
    }
}
public class Program04{
    public static void main(String [] args) {

// instantation a new MyNewRectangle object
        NewRectangle R = new NewRectangle(7,9);

        System.out.println(R.getLength());
        System.out.println(R.getBeadth());
    }
}