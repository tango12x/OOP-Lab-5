package Frontend.src.backend;
import java.io.IOException;

public class StudentDbTest {

    public static void main(String[] args) throws IOException {
        //CREATING DATABASE INSTANCE
        StudentDB db = new StudentDB("data/students");
        //READING THE FILE
        db.readFromFile();
        //LOOPING THROUGH THE RECORDS TO PRINT IT
        for(int i=0;i<db.getRecords().size();i++){
            System.out.print(db.getRecords().get(i).lineRepresentation());}
        System.out.print("---------------------------------------");
        //ADDING NEW STUDENT TO THE FILE
        db.addStudent(new Student(9789,"Abdelrahman Atef",21,"male","CCE", (float) 3.6));
        //REMOVING OLD STUDENT
        db.removeStudent(db.getStudent(15));
        //WRITING THE NEW RECORDS TO THE FILE
        db.writeInFile();
        //READING FROM THE FILE AGAIN
        db.readFromFile();
        for(int i=0;i<db.getRecords().size();i++){
            System.out.print(db.getRecords().get(i).lineRepresentation());}}
}

