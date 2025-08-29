 public class EmployeeStatic {

    int Emp_ID;
    static String Org;

    static void staticMethod(){
        System.out.println("This is static method");
    }

    void details(){
        System.out.println("ID: "+Emp_ID+" "+"Organisation is: "+Org);
    }

    public static void main(String[] args) {

        EmployeeStatic.Org = "Kiet";
        EmployeeStatic es = new EmployeeStatic();
        es.Emp_ID = 101;
        // es.Org = "Kiet";
        es.details();

        EmployeeStatic es2 = new EmployeeStatic();
        es2.Emp_ID = 102;
        // es2.Org = "Kiet";
        es2.details();

        staticMethod();
    }


}
