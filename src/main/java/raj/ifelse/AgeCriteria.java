//1. WAP to return age criteria as a string where if age is less than 18 then return child , if age is greater than
//18 and less than 60 then return Young and if age is greater than 60 then return SeniorCitizen
//: Signature --> findAgeCriteria that will accept int as argument and return type is String
package raj.ifelse;
//public class FindAgeCriteria{
public class AgeCriteria{
    static String FindAgeCriteria(int age){
       //int a =28;
        if(age<18){
            return " child";
        }
        else if(age<60){
            return " young ";
        }
        else{
            return " seniorCitizen ";
        }
    }
    public static void main(String [] args){
      //  int age = 28;
        System.out.println(FindAgeCriteria(16));
    }
}
