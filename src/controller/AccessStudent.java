package controller;

import model.Student;

public class AccessStudent {
    public static void main(String[] args) {
        //one student instance
        Student student = new Student("James Gosling",66,"MALE",202039193);

        printStudent(student);
    }

    //prints student info
    public static void printStudent(Student student){
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student Gender: " + student.getGender());
        System.out.println("Student ID NUMBER: " + student.getIdNumber());
    }
}
