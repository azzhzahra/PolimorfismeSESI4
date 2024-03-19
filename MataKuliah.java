/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matakuliah;

/**
 *
 * @author User
 */

//OVERRIDING


class Course {
    private String courseName;

    public Course(String name) {
        this.courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }
}

// Kelas turunan yang mewakili mata kuliah yang memiliki kode
class CodedCourse extends Course {
    private String courseCode;

    public CodedCourse(String name, String code) {
        super(name);
        this.courseCode = code;
    }

    public String getCourseCode() {
        return courseCode;
    }
}

// Kelas turunan yang mewakili mata kuliah dengan jumlah kredit
class CreditCourse extends Course {
    private int creditHours;

    public CreditCourse(String name, int creditHours) {
        super(name);
        this.creditHours = creditHours;
    }

    public int getCreditHours() {
        return creditHours;
    }
}

public class MataKuliah {
    public static void main(String[] args) {
        // Membuat objek berbagai jenis mata kuliah
        Course course1 = new Course("Introduction to Programming");
        CodedCourse course2 = new CodedCourse("Data Structures","CS202");
        CreditCourse course3 = new CreditCourse("Calculus",4);

        // Memanggil metode untuk mendapatkan detail mata kuliah
        System.out.println("Course 1: " + course1.getCourseName());
        System.out.println("Course 2: " + course2.getCourseName() + " (" + course2.getCourseCode() + ")");
        System.out.println("Course 3: " + course3.getCourseName() + " (" + course3.getCreditHours() + " credit hours)");
    }
}



    
