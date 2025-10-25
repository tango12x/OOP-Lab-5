package Frontend.src.gui;
import Frontend.src.backend.Student;
import Frontend.src.backend.StudentDB;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;

public class SearchStudent extends JFrame {
    //CLASS CONSTRUCTOR
    public SearchStudent(){

        //===== MAIN WINDOW =====
        setTitle("Searching for the student in the system");
        ImageIcon imageIcon = new ImageIcon("data/studentIcon.png");
        setIconImage(imageIcon.getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10,10)); // <--- IMPORTANT


        //===== PANEL FOR INPUT =====
        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Enter Student ID:");
        JTextField searchField = new JTextField(15);
        JButton searchButton = new JButton("Search");
        searchButton.setFocusable(false);
        searchButton.setMnemonic(KeyEvent.VK_S);
        searchButton.setToolTipText("Press to search for student");
        searchPanel.add(label);
        searchPanel.add(searchField);
        searchPanel.add(searchButton);
        //ADDING THE PANEL TO THE FRAME
        add(searchPanel, BorderLayout.NORTH);

        //===== RESULT AREA =====
        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);
        add(new JScrollPane(resultArea), BorderLayout.CENTER);


        //===== ACTION LISTENER =====
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idText = searchField.getText().trim();
                // SIMPLE VALIDATION
                if(idText.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please enter an ID!");
                    return;}
                //RETURNING BACK THE STUDENT
                StudentDB db = new StudentDB("data/students");
                try {
                    db.readFromFile();
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                Student student = db.getStudent(Integer.parseInt(idText));
                //CHECKING IF THE STUDENT IS IN THE DATABASE
                if(student ==null){
                    JOptionPane.showMessageDialog(null, "There is no student found by this id");
                    return;}
                //DISPLAYING THE STUDENT IF FOUND
                else{
                    resultArea.setText(
                                    "--------------------------------------\n" +
                                    "           Student Found\n" +
                                    "--------------------------------------\n\n" +
                                    "ID: " + student.getId() + "\n" +
                                    "Name: " + student.getFullName() + "\n" +
                                    "Age: " + student.getAge() + "\n" +
                                    "Department: " + student.getDepartment() + "\n" +
                                    "GPA: " + student.getGPA() + "\n");
                    ;}}});

        setVisible(true);}

    public static void main(String[] args){
        new SearchStudent();}
}
