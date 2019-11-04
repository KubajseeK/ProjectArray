package sk.itsovy.kutka.school;

public class Staff extends Person {
    private String position;
    private int bonus;

    public Staff(String name, int age, String position, int bonus) {
        super(name, age);
        this.position = position;
        this.bonus = bonus;
    }
}
