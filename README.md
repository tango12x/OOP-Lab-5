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
This project implements a **Student Management System (SMS)** using **Java Swing** for the GUI and **Object-Oriented Programming (OOP)** for backend logic.  
It provides a simple and intuitive way to **add, view, update, delete, and search** student records, with all data stored in files for persistence.

---

## 🎯 Objectives
- Build a full Java Swing GUI application.  
- Apply **Encapsulation**, **Inheritance**, **Polymorphism**, and **Abstraction**.  
- Implement **CRUD** operations with data validation.  
- Use **events and listeners** for user interaction.  
- Separate logic into **frontend (GUI)** and **backend (data handling)** layers.

---

## 🧩 System Features

| Feature | Description |
|----------|-------------|
| ➕ **Add Student** | Enter student info, validate, and save to file. |
| 👁️ **View Students** | Display all records in a `JTable`. |
| ✏️ **Update Student** | Edit an existing student’s data. |
| ❌ **Delete Student** | Remove a student record with confirmation. |
| 🔍 **Search Student** | Find students by ID or name. |

🧠 *All actions include input validation and confirmation messages.*

---

## 🖥️ GUI Layout

| Screen | Description |
|---------|--------------|
| 🔑 **Login** | Username and password verification. |
| 🏠 **Dashboard** | Navigation buttons to different panels. |
| 🧾 **Add Student** | Text fields, combo boxes, and save button. |
| 📋 **View Students** | Table view with scrollable data. |
| 🔎 **Search & Update** | Search box, results table, editable fields. |
| 🗑️ **Delete** | Table + confirmation dialog before removal. |

🧱 **Swing Components Used:**  
`JFrame`, `JPanel`, `JLabel`, `JTextField`, `JButton`, `JComboBox`, `JTable`, `JOptionPane`.

---

## 🧠 OOP Concepts Applied

| Concept | Example |
|----------|----------|
| **Encapsulation** | Private fields with getters/setters. |
| **Inheritance** | Shared base classes for GUI/data. |
| **Polymorphism** | Overridden methods for flexibility. |
| **Abstraction** | Abstract base classes for operations. |

---

## 💾 Data Handling
- Student data stored in text files (read/write).  
- Uses `ArrayList<Student>` to manage students in memory.  
- File operations used for **Save** and **Load**.  
- Input validation and error handling with `JOptionPane`.

---

## 🔄 Typical Program Flow
