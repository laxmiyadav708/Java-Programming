import java.util.ArrayList;

class Student {
    int rollNumber;
    String name;
    String course;

    Student(int rollNumber, String name, String course) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
    }

    void display() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", Course: " + course);
    }
}

public class StudentListDemo {
    public static void main(String[] args) {
       
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Laxmi", "Java"));
        students.add(new Student(102, "Harshita", "Python"));
        students.add(new Student(103, "Kratika", "C++"));
        students.add(new Student(104, "Khushi", "JavaScript"));
        students.add(new Student(105, "Ritika", "SQL"));

       
        System.out.println();
        for (Student s : students) {
            s.display();
        }

        int searchRoll = 101;
        System.out.println( "\nSearching for roll number " + searchRoll + ":");
        boolean found = false;
        for (Student s : students) {
            if (s.rollNumber == searchRoll) {
                s.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with roll number " + searchRoll + " not found.");
        }
    }
}
