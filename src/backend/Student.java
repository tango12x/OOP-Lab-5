package Frontend.src.backend;
public class Student {

    //CLASS ATTRIBUTES
    private int id;
    private String fullName ;
    private int age ;
    private String gender;
    private String department;
    private float GPA ;

    //GETTERS FOR ALL ATTRIBUTES
    public int getId() {return id;}
    public String getFullName() {return fullName;}
    public int getAge() { return age; }
    public String getGender() {return gender;}
    public String getDepartment() { return department;}
    public float getGPA() { return GPA; }

    //SETTERS FOR ALL ATTRIBUTES
    public void setGPA(float GPA) {
        if(GPA < 0 || GPA > 4) {
            throw new IllegalArgumentException("INVALID GPA IS ENTERED");
        }else {this.GPA = GPA;}}
    public void setGPA(){
        //logic to generate id automatically
        }
    public void setAge(int age) {
        if(age<4 || age>27){
            throw new IllegalArgumentException("INVALID AGE IS ENTERED ");
        }else{this.age=age;}}
    public void setId(int id) {
        if(id<1){
            throw new IllegalArgumentException("INVALID ID IS ENTERED");
        }else{this.id=id;}}
    public void setFullName(String fullName) {
        if(fullName.split(" ").length<2 || fullName.isEmpty()){
            throw new IllegalArgumentException("THIS IS INVALID FULLNAME");}
        for(int i = 0 ; i<fullName.length();i++ ){
            if(!Character.isLetter(fullName.charAt(i))){
                throw new IllegalArgumentException("INVALID NAME IS ENTERED");}}
        this.fullName = fullName;}
    public void setGender(String gender) {
        gender = gender.strip().toLowerCase();
        if(!gender.equals("male")&&!gender.equals("female")){
            throw new IllegalArgumentException("INVALID GENDER IS ENTERED");
        }else{this.gender = gender;}}
    public void setDepartment(String department) {
        this.department = department.strip();}



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

    //METHOD LINE REPRESENTATION FOR THE STUDENT DATA
    public String lineRepresentation(){
        return String.join(",",String.valueOf(this.id) , this.fullName , String.valueOf(this.age)
                                ,this.gender ,this.department , this.GPA+"\n");}
}
