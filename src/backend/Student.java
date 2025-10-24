package Frontend.src.backend;
public class Student {

    //CLASS ATTRIBUTES
    private int id;
    private String fullName ;
    private int age ;
    private String gender;
    private String department;
    private float GPA ;




    //CLASS CONSTRUCTORS IF ID IS ENTERED MANUALLY
    public Student (int id ,String fullName,int age,String gender ,String department,float GPA ){
        this.setId(id);
        this.setFullName(fullName);
        this.setAge(age);
        this.setGender(gender);
        this.setDepartment(department);
        this.setGPA(GPA);}

    //CLASS CONSTRUCTOR IF THE ID IS GENERATED AUTOMTICALLY
    public Student (int id ,String fullName,int age,String gender ,String department){
        this.setId(id);
        this.setFullName(fullName);
        this.setAge(age);
        this.setGender(gender);
        this.setDepartment(department);}














}
