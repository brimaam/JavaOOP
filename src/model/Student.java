package model;

public class Student {
    //variables
    private String name;
    private int age;
    private String gender;
    private int idNumber;

    //constructors
    public Student(){

    }

    public Student(String name, int age, String gender, int idNumber){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.idNumber = idNumber;
    }

    //getters and setters

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

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
