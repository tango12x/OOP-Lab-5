package Frontend.src.backend;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDB {


    //CLASS ATTRIBUTES
    private String fileName;
    private ArrayList<Student> students ;

    //CLASS CONSTRUCTOR
    public StudentDB (String fileName){
        this.fileName = fileName.strip();
        this.students = new ArrayList<>();}

    //METHOD TO READ FROM THE FILE
    public void readFromFile() throws FileNotFoundException {
        File file  = new File(this.fileName);
        Scanner fileReader = new Scanner(file);
        while(fileReader.hasNextLine()){
            String record = fileReader.nextLine().strip();
            String[] recordArray = record.split(",");
            int id  = Integer.parseInt(recordArray[0].strip());
            String fullName = recordArray[1].strip();
            int age = Integer.parseInt(recordArray[2].strip());
            String gender = recordArray[3].strip().toLowerCase();
            String department = recordArray[4].strip();
            float gpa = Float.parseFloat(recordArray[5].strip());
            this.students.add(new Student(id,fullName,age,gender,department,gpa));}}

    //METHOD TO TELL IF THE STUDENT IS INSIDE THE DB OR NOT USING ID
    public boolean isExistInStudentDatabase(int id){
        for(int i =0 ; i<this.students.size();i++){
            if(this.students.get(i).getId() ==id){
                return true;}}
        return false;}

    //METHOD TO RETURN THE STUDENT IF EXIST IN THE DB
    public Student getStudent(int id){
        for(int i =0 ; i<this.students.size();i++){
            if(this.students.get(i).getId() ==id){
                return this.students.get(i);}}
        return null;}
    
}
