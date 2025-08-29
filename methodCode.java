public class methodCode{
int id;
String name;
methodCode(){
    // id=111;
    // name="Sudhanshu";
    System.out.println("Hello");
}
methodCode(int id,String name){
    this.id=id;
    this.name=name;
    System.out.println("parametrized constructor");

}
public void displayMethod(){
    System.out.println("Details are: " +id+ " "+ name);
 }

public static void main(String[] args){
     methodCode m1=new methodCode();
    m1.id=101;
    m1.name="Gill";
    m1.displayMethod();

    methodCode m2 = new methodCode();
    m2.id=102;
    m2.name="XYZ";
    m2.displayMethod();

    methodCode m3 = new methodCode(111,"ABC");
    m3.displayMethod();
}
}