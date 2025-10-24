package Backend;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String department;
    private double gpa;

    // Static counter for auto ID generation
    private static int idCounter = 1000;

    // === Constructors ===
    public Student() {
        this.id = generateID();
    }

    // Constructor with auto-generated ID
    public Student(String name, int age, String gender, String department, double gpa) {
        this.id = generateID();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.gpa = gpa;
    }

    // Constructor with manual ID (used if loaded from file or user enters it)
    public Student(int id, String name, int age, String gender, String department, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.gpa = gpa;
    }

    private int generateID() {
        return idCounter++;
    }

    // === Getters and Setters ===
    public int getId() {
        return id;
    }

    public void setId(int id) { 
        this.id = id; // only if entered manually
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { 
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) { 
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) { 
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) { 
        this.department = department;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) { 
        this.gpa = gpa;
    }
}