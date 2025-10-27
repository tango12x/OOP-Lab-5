# 🎓 Student Management System  
### CC272 – Programming II (Lab 5)  
**Alexandria University | Faculty of Engineering | Computer & Communication Department**  
_Fall 2025 / 2026_

---

![Java](https://img.shields.io/badge/Language-Java-orange?logo=openjdk)
![Swing](https://img.shields.io/badge/GUI-Java%20Swing-blue)
![OOP](https://img.shields.io/badge/Paradigm-OOP-red)
![Status](https://img.shields.io/badge/Status-Completed-success)

---

## 📘 Overview
This project implements a **Student Management System (SMS)** using **Java Swing** for the GUI and **Object-Oriented Programming (OOP)** principles for the backend logic.  
It provides a simple and intuitive way to **add, view, update, delete, and search** student records, with all data stored in files for persistence.

The project demonstrates a complete integration of GUI design, data management, and OOP principles in Java — aligning with the requirements of **Programming II (CC272)**.

---

## 🎯 Objectives
- Develop a full **Java Swing GUI application**.  
- Apply OOP principles: **Encapsulation**, **Inheritance**, **Polymorphism**, and **Abstraction**.  
- Implement **CRUD operations** with validation and error handling.  
- Use **Swing events and listeners** to respond to user actions.  
- Separate **frontend (GUI)** and **backend (data handling)** modules.

---

## 🧩 System Features

| Feature | Description |
|----------|-------------|
| ➕ **Add Student** | Input student details, validate fields, and save to file. |
| 👁️ **View Students** | Display all students in a `JTable`. |
| ✏️ **Update Student** | Edit existing student data. |
| ❌ **Delete Student** | Remove student record with confirmation. |
| 🔍 **Search Student** | Find students by ID or name and display results. |

🧠 *All features are fully interactive and connected to file storage.*

---

## 🖥️ GUI Layout

| Screen | Description |
|---------|--------------|
| 🔑 **Login** | Username & Password screen before accessing the system. |
| 🏠 **Dashboard / Home** | Main menu with navigation buttons. |
| 🧾 **Add Student Panel** | Input form with labels, fields, and combo boxes. |
| 📋 **View Students Panel** | Table view listing all student records. |
| 🔎 **Search & Update Panel** | Search box + editable form for updates. |
| 🗑️ **Delete Panel** | Table view + confirmation dialog for deletion. |

🧱 **Swing Components Used:**  
`JFrame`, `JPanel`, `JLabel`, `JTextField`, `JButton`, `JComboBox`, `JTable`, `JOptionPane`.

---

## 🧠 OOP Concepts Applied

| Concept | Example |
|----------|----------|
| **Encapsulation** | Private fields with public getters/setters for student attributes. |
| **Inheritance** | Common base classes reused across GUI panels. |
| **Polymorphism** | Overridden methods for specific student actions. |
| **Abstraction** | Abstract classes or interfaces defining shared operations. |

---

## 💾 Data Handling
- Student data is **saved and loaded** from local text files.  
- An `ArrayList<Student>` stores data during runtime.  
- Includes **input validation**, ensuring valid age, GPA, and no empty fields.  
- Uses `JOptionPane` dialogs for all messages, errors, and confirmations.  

---

## 🔄 Typical Program Flow
```text
Start App → Login → Home Screen
   ↓
Add Student → Validate → Save → "Student Added!"
   ↓
View Students → Display Table
   ↓
Search / Update / Delete → Confirm → File Updated
```

---

## 🧱 Example Project Structure
```text
src/
 ├── model/
 │   └── Student.java
 ├── service/
 │   └── StudentManager.java
 ├── gui/
 │   ├── LoginFrame.java
 │   ├── Dashboard.java
 │   ├── AddStudentPanel.java
 │   ├── ViewStudentsPanel.java
 │   └── SearchUpdatePanel.java
 └── Main.java
```

---

## 🧪 Validation & Error Handling
| Check | System Response |
|--------|----------------|
| Empty Field | Displays a warning dialog. |
| Invalid Age or GPA | Rejects input and requests correction. |
| Duplicate ID | Shows an error message. |
| Missing Data File | Automatically creates a new file. |

---

## ✨ Optional Enhancements
- GPA-based sorting or filtering.  
- Export all student records to CSV format.  
- Improved layout and color themes using custom Swing components.  
- Search suggestions as user types.

---


