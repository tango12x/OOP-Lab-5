package Frontend.src.gui;

import Frontend.src.backend.Student;
import Frontend.src.backend.StudentDB;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class SearchStudent extends JFrame {

    public SearchStudent() {

        //===== MAIN WINDOW =====
        setTitle("Searching for the student in the system");
        ImageIcon imageIcon = new ImageIcon("data/studentIcon.png");
        setIconImage(imageIcon.getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(550, 350);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        //===== PANEL FOR INPUT =====
        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new GridLayout(2, 3, 8, 8));

        // Search by ID
        JLabel idLabel = new JLabel("Search by ID:");
        JTextField idField = new JTextField(12);
        JButton searchByIdButton = new JButton("Search ID");

        // Search by Name
        JLabel nameLabel = new JLabel("Search by Name:");
        JTextField nameField = new JTextField(12);
        JButton searchByNameButton = new JButton("Search Name");

        searchPanel.add(idLabel);
        searchPanel.add(idField);
        searchPanel.add(searchByIdButton);

        searchPanel.add(nameLabel);
        searchPanel.add(nameField);
        searchPanel.add(searchByNameButton);

        add(searchPanel, BorderLayout.NORTH);

        //===== RESULT AREA =====
        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);
        resultArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
        add(new JScrollPane(resultArea), BorderLayout.CENTER);

        //===== ACTION: SEARCH BY ID =====
        searchByIdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String idText = idField.getText().trim();
                if (idText.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter an ID!");
                    return;
                }

                StudentDB db = new StudentDB("data/students");
                try { db.readFromFile(); } catch (FileNotFoundException ex) { throw new RuntimeException(ex); }

                Student student = db.getStudent(Integer.parseInt(idText));

                if (student == null) {
                    resultArea.setText("No student found with ID: " + idText);
                } else {
                    showStudentInfo(student, resultArea);
                }
            }
        });

        //===== ACTION: SEARCH BY NAME =====
        searchByNameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nameText = nameField.getText().trim().toLowerCase();
                if (nameText.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a Name!");
                    return;
                }

                StudentDB db = new StudentDB("data/students");
                try { db.readFromFile(); } catch (FileNotFoundException ex) { throw new RuntimeException(ex); }

                Student found = null;

                for (Student s : db.getRecords()) {
                    if (s.getFullName().toLowerCase().equals(nameText)) {
                        found = s;
                        break;
                    }
                }

                if (found == null) {
                    resultArea.setText("No student found with name: " + nameText);
                } else {
                    showStudentInfo(found, resultArea);
                }
            }
        });

        setVisible(true);
    }

    // Helper method to display student info cleanly
    private void showStudentInfo(Student student, JTextArea area) {
        area.setText(
                "--------------------------------------\n" +
                        "           Student Found\n" +
                        "--------------------------------------\n\n" +
                        "ID: " + student.getId() + "\n" +
                        "Name: " + student.getFullName() + "\n" +
                        "Age: " + student.getAge() + "\n" +
                        "Gender: " + student.getGender() + "\n" +
                        "Department: " + student.getDepartment() + "\n" +
                        "GPA: " + student.getGPA() + "\n"
        );
    }

    public static void main(String[] args) {
        new SearchStudent();
    }
}
