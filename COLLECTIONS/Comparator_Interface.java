package COLLECTIONS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Class to represent a Student
class Student {
    // Attributes of a student
    int rollno;
    String name, address;

    // Constructor
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Overriding toString() to print student details
    @Override
    public String toString() {
        return this.rollno + " " + this.name + " " + this.address;
    }
}

// Comparator to sort by roll number
class SortByRoll implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.rollno - s2.rollno;
    }
}

// Comparator to sort by name
class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class Comparator_Interface {
    public static void main(String[] args) {
        // Creating a list of students
        ArrayList<Student> students = new ArrayList<>();

        // Adding student entries to the list
        students.add(new Student(111, "Kajal", "Haridwar"));
        students.add(new Student(112, "Priya", "Dehradun"));
        students.add(new Student(113, "Rahul", "Bangalore"));
        students.add(new Student(114, "Miss Kajal", "USA"));

        // Display unsorted list
        System.out.println("Unsorted list:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sorting by roll number
        Collections.sort(students, new SortByRoll());
        System.out.println("\nSorted by roll number:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sorting by name
        Collections.sort(students, new SortByName());
        System.out.println("\nSorted by name:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
