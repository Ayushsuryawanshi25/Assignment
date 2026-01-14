package Assignment2;

import java.util.*;

public class StudentRecordManagment {

    public static void main(String[] args) {

        Student s1 = new Student("Ayush", 1001, "AIML", "1234");
        Student s2 = new Student("Pranshi", 1002, "AIML", "2345");
        Student s3 = new Student("Harshit", 1003, "AIML", "3456");
        Student s4 = new Student("Abhay", 1004, "AIML", "4567");
        Student s5 = new Student("Rahul", 1005, "AIML", "5678");

        List<Student> studentList = new ArrayList<>();

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        // Print all records
        printRecord(studentList);

        System.out.println();
        System.out.println("After Remove record using roll no");
        System.out.println();

        removeRecord(studentList, 1004);
        printRecord(studentList);

        System.out.println();
        System.out.println("Searched Student : ");
        System.out.println();

        searchStudent(studentList, 1005);
    }

    static void printRecord(List<Student> studentList) {
        for (Student s : studentList) {
            System.out.println(
                "Student Name = " + s.name +
                "  Roll Number = " + s.RollNo +
                "  Branch = " + s.branch +
                "  Mobile Number = " + s.MobileNo
            );
        }
    }

    static void removeRecord(List<Student> studentList, int rollno) {

        Iterator<Student> it = studentList.iterator();

        while (it.hasNext()) {
            Student s = it.next();
            if (s.RollNo == rollno) {
                it.remove();
                return;
            }
        }
        System.out.println("Student record not found");
    }

    static void searchStudent(List<Student> studentList, int rollno) {

        for (Student s : studentList) {
            if (s.RollNo == rollno) {
                System.out.println(
                    "Student Name = " + s.name +
                    "  Roll Number = " + s.RollNo +
                    "  Branch = " + s.branch +
                    "  Mobile Number = " + s.MobileNo
                );
                return;
            }
        }
        System.out.println("Student Record not Found");
    }
}

class Student {

    public String name;
    public int RollNo;
    public String branch;
    public String MobileNo;

    Student(String name, int RollNo, String branch, String MobileNo) {
        this.name = name;
        this.RollNo = RollNo;
        this.branch = branch;
        this.MobileNo = MobileNo;
    }
}
