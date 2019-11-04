package sk.itsovy.kutka.school;

public class Student extends Person {
    private String group;

    public Student(String name, int age, String group) {
        super(name, age);
        this.group = group;
    }
}
