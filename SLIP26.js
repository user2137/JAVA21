//Q.1

import java.util.Scanner;

class AttendanceException extends Exception {
    AttendanceException(String msg) {
        super(msg);
    }
}

class Student {
    String student_name;
    int student_rollno, total_lectures, attended_lectures;

    Student(String name, int rollno, int total, int attended) {
        student_name = name;
        student_rollno = rollno;
        total_lectures = total;
        attended_lectures = attended;
    }

    void display() throws AttendanceException {
        double percentage = (attended_lectures * 100.0) / total_lectures;

        if (percentage < 75)
            throw new AttendanceException("Student is Not Eligible for Exam");

        System.out.println("Name: " + student_name);
        System.out.println("Roll No: " + student_rollno);
        System.out.println("Attendance: " + percentage + "%");
    }
}

public class SLIP26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        System.out.print("Enter total lectures: ");
        int total = sc.nextInt();

        System.out.print("Enter attended lectures: ");
        int attended = sc.nextInt();

        try {
            Student s = new Student(name, roll, total, attended);
            s.display();
        } catch (AttendanceException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

//Q.2

const fs = require('fs');

fs.writeFile('abc.txt', 'Hello Node.js', (err) => {
    if (err) {
        console.log("Error creating file");
        return;
    }

    console.log("File created successfully");

    fs.copyFile('abc.txt', 'copy.txt', (err) => {
        if (err) {
            console.log("Error copying file");
            return;
        }

        console.log("File copied successfully");

        fs.rename('copy.txt', 'new.txt', (err) => {
            if (err) {
                console.log("Error renaming file");
                return;
            }

            console.log("File renamed successfully");

            fs.unlink('new.txt', (err) => {
                if (err) {
                    console.log("Error deleting file");
                    return;
                }

                console.log("File deleted successfully");
            });
        });
    });
});