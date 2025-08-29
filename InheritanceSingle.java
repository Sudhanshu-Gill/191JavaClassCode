class  Employee  {
    int id;
    String name;
    String org;

    void details(){
        System.out.println("ID: " + id + "\nName: " + name + "\nOrganization: " + org);
    }
    

    
}

class Faculty extends  Employee{
    String dept;
    String subject;

    void FacultyDetails(){
        System.out.println("Department is:  "+dept+" \nSubject is: "+subject);
    }

}



public class InheritanceSingle {
    public static void main(String[] args) {
        Faculty f1=new Faculty();
        f1.id = 101;
        f1.name = "ABC";
        f1.org = "KIET";
        f1.dept = "AIML";
        f1.subject = "JAVA";
        f1.details();
        f1.FacultyDetails();
    }
    
}